package com.contentsale.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contentsale.service.UserService;

//Ajax异步传输接口
@Controller
@RequestMapping(value = "/api")
public class ApiController {
	@Autowired
	private UserService userService;
	

	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(@RequestParam("userName") String userName,@RequestParam("password")String password,
			Model map,HttpServletResponse response,HttpSession session){
		 System.out.println(userName + ":" + password);
		boolean result = userService.login(userName, password);
		if(result) { 
			session.setAttribute("user", userService.getUser(userName));
			map.addAttribute("code",200);
			map.addAttribute("message","success");
			map.addAttribute("result",true);
			System.out.println("aaaaaaa");
		}else {
			map.addAttribute("code",401);
			map.addAttribute("message", "账号或密码错误");
			map.addAttribute("result",false);
			System.out.println("bbbbbbbbbbb");
		}
		return "json";
	}
	
	
	/**
	 *  图片上传
	 * @return
	 */
	@RequestMapping("/upload")
	public String uploadPic() {
		return "";
	}

}
