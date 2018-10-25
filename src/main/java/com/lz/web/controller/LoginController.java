package com.lz.web.controller;

import com.lz.domain.User;
import com.lz.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * LoginController class
 *
 * @author wjh
 * @date 2018/10/24
 */
@Controller
@Slf4j
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/login")
	public String login(Model model, HttpServletRequest request){
		log.info("登陆控制器");
		String exceptionClassName = (String)request.getAttribute("shiroLoginFailure");
		if(exceptionClassName!=null){
			if(UnknownAccountException.class.getName().equals(exceptionClassName)){
				model.addAttribute("errorMsg","账号不存在");
			}else if(IncorrectCredentialsException.class.getName().equals(exceptionClassName)){
				model.addAttribute("errorMsg","密码错误");
			}else{
				model.addAttribute("errorMsg","其他异常");
			}
		}
		/*此方法不处理认证成功，成功后会自动跳转到上一个请求路径*/
		return "login";
	}
}
