package com.lz.web.controller;

import com.lz.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UserController class
 *
 * @author wjh
 * @date 2018/10/29
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequiresPermissions("user:add")
	@RequestMapping("/add")
	public String add(){
		return  "add";
	}
	@RequiresPermissions("user:delete")
	@RequestMapping("/delete")
	public String delete(){
		return  "delete";
	}
	@RequiresPermissions("user:update")
	@RequestMapping("/update")
	public String update(){
		return  "update";
	}
	@RequestMapping("/find")
	public String find(){
		return  "find";
	}
}
