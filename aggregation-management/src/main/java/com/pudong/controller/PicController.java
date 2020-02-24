/**
 * 
 */
package com.pudong.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.pudong.pojo.Pic;
import com.pudong.service.PicService;

@Controller
public class PicController {

	@Resource
	private PicService picServiceImpl;
	@RequestMapping("insert")
	public String insert(MultipartFile file,HttpServletRequest request) {
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(request.getServletContext().getRealPath("files"),file.getOriginalFilename()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Pic pic = new Pic();
		pic.setPath(file.getOriginalFilename());
		int index = picServiceImpl.addPic(pic);
		if(index > 0) {
			return "redirect:/show";
		}else {
			return "index.jsp";
		}
	}
	@RequestMapping("show")
	public String show(Model model) {
		model.addAttribute("list", picServiceImpl.show());
		
		return "main.jsp";
	} 
	@RequestMapping("delete")
	public String delete(int id) {
		int re = picServiceImpl.removeById(id);
		if(re > 0) {
			return "main.jsp";
		}else {
			return "redirect:/index.jsp";
		}
	}
}
