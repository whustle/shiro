package com.lz.web.realms;

import com.lz.domain.Permission;
import com.lz.domain.User;
import com.lz.service.PermissionService;
import com.lz.service.RoleService;
import com.lz.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * UserRealm class
 *
 * @author wjh
 * @date 2018/10/23
 */
@Slf4j
public class UserRealm extends AuthorizingRealm{
	@Autowired
	private UserService userService;
	@Autowired
	private PermissionService permissionService;
	@Override
	public String getName() {
		return "userRealm";
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		SimpleAuthorizationInfo info = null;
		User user = (User)principalCollection.getPrimaryPrincipal();
		System.out.println(user.getId());
		info = new SimpleAuthorizationInfo();
		User user1 = userService.findUserByUserName(user.getUsername());
		List<Permission> list = permissionService.findPermissionByUserId(user1.getId());
		for (Permission perm:list
				) {
			log.info(perm.getCode());
			info.addStringPermission(perm.getCode());
		}
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		log.info("认证");
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
		String username = usernamePasswordToken.getUsername();
		User user = userService.findUserByUserName(username);
		if(user!=null){
			AuthenticationInfo authenticationInfo= authenticationInfo = new SimpleAuthenticationInfo(user,user.getPassword(),ByteSource.Util.bytes(user.getSalt()),getName());
			return authenticationInfo;
		}
		return null;
	}
}

