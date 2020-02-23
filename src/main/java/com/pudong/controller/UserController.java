/**
 * 
 */
package com.pudong.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudong.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	@RequestMapping("demo")
	public String demo(Model model) {
		model.addAttribute("list", userService.show());
		System.out.println("执行demo方法");
		return "index.jsp";
	}
}
