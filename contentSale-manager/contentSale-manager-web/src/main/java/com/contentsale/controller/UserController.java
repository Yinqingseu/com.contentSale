package com.contentsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.contentsale.pojo.User;
import com.contentsale.service.UserService;

/**
 * 用户相关控制
 * @author YQ
 *
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	

	@RequestMapping("/user")
	public ModelAndView helloUser() {
		ModelAndView mav = new ModelAndView();
		User user = new User();
		user.setUsername("test");
		user.setPassword("123");
		return new ModelAndView("user","user",user);
	}
	
	
	
}
