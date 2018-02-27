package com.contentsale.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contentsale.pojo.User;
import com.contentsale.service.UserService;

/**
 * 登录页面
 * @author YQ
 *
 */
@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("/login")
	public String logIn(){
		return "login";
	}
	
	/**
	 * 退出后跳转至内容展示页面
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String logOut(HttpSession session){
		session.invalidate();
		return "redirect:index";
	}
}
