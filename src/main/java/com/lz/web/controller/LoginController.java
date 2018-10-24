package com.lz.web.controller;

import com.lz.dao.UserDao;
import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(){
		return "login";
	}

}
