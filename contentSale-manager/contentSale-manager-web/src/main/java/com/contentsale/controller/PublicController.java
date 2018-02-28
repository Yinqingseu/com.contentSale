package com.contentsale.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.User;
import com.contentsale.service.ContentService;

/**
 * 内容发布
 * @author YQ
 *
 */
@Controller
public class PublicController {
	
	@Autowired
	private ContentService contentService;
	
	/**
	 * 发布内容页面
	 * @return
	 */
	@RequestMapping("/public")
	public String publicContent(HttpSession session) {
		//获取用户信息
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:login";
		}
		return "public";
	}
	

	
	/**
	 * 内容提交结果页面
	 * @return
	 */
	@RequestMapping("/publicSubmit")
	public String submitContent(@RequestParam("title") String title ,@RequestParam("summary") String summary ,
			@RequestParam("image") String image ,@RequestParam("detail") String detail,
			@RequestParam("price") Double price,Model map,HttpSession session) {
		//获取用户信息
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:login";
		}else {
			map.addAttribute("user", user);
		}
		Contents content = new Contents();
		content.setTitle(title);
		content.setSummary(summary);
		content.setPic(image);
		content.setDetail(detail);
		content.setPrice(price);
		if(title.length()>80 || summary.length()>140 ||detail.length()>1000 ) {
			return "publicSubmit";
		}
		//内容存储至数据库
		contentService.insertContent(content);
		map.addAttribute("product",content);	
		return "publicSubmit";
	}
	
	
}
