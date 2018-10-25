package com.lz.web.realms;

import com.lz.domain.User;
import com.lz.service.UserService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

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
	@Override
	public String getName() {
		return "userRealm";
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		log.info("认证");
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
		String username = usernamePasswordToken.getUsername();
		log.info(username);
		log.info("*************");
		User user = userService.findUserByUserName(username);
		System.out.println(user);
		log.info("************");
		if(user!=null){
			AuthenticationInfo authenticationInfo= authenticationInfo = new SimpleAuthenticationInfo(user,user.getPassword(),ByteSource.Util.bytes(user.getSalt()),getName());
			return authenticationInfo;
		}
		return null;
	}
}

