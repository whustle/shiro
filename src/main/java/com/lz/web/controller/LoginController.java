package com.lz.web.controller;

import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginController class
 *
 * @author wjh
 * @date 2018/10/24
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(){
		return "forward:/WEB-INF/jsp/login.jsp";
	}

}
