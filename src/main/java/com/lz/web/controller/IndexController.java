package com.lz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController class
 *
 * @author wjh
 * @date 2018/10/24
 */
@Controller
public class IndexController {
	@RequestMapping("/index")
	public String index(){
		return "forward:/index.jsp";
	}
}
