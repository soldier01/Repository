/**
 * 
 */
package com.pudong.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudong.pojo.Pic;
import com.pudong.service.PicService;

@Controller
public class PicController {

	@Resource
	private PicService picServiceIml;
	
	@RequestMapping("/")
	public String demo(Model model) {
		System.out.println("model and project");
		model.addAttribute("list", picServiceIml.show());
		return "index.jsp";
	}
	
}
