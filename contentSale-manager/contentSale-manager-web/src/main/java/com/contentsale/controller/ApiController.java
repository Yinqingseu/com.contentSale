package com.contentsale.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
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
import org.springframework.web.multipart.MultipartFile;

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
//			System.out.println("aaaaaaa");
		}else {
			map.addAttribute("code",401);
			map.addAttribute("message", "账号或密码错误");
			map.addAttribute("result",false);
//			System.out.println("bbbbbbbbbbb");
		}
		return "json";
	}
	
	
	/**
	 *  图片上传
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@RequestMapping("/upload")
	@ResponseBody
	public Model uploadPic(@RequestParam("file") MultipartFile file,Model map,
			HttpServletRequest request) throws IllegalStateException, IOException {
		//		文件存放服务端位置
		String path = request.getSession().getServletContext().getRealPath("/uploadImgs");
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		//生成uuid作为文件名称
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String imgName = uuid+file.getOriginalFilename();
		String imgType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1, 
				file.getOriginalFilename().length());
		System.out.println("path:"+path+" name:"+imgName+" type: "+imgType);
		if(!file.isEmpty() && imgType.toLowerCase().equals("jpg")) {
			//保存图片至服务器
			file.transferTo(new File(dir.getAbsolutePath()+File.separator+imgName));
			System.out.println("upload img success!");
			map.addAttribute("code", "200");
			String basePath = request.getSession().getServletContext().getRealPath("/uploadImgs/");
			System.out.println("result path:"+basePath+File.separator+imgName);
			map.addAttribute("result", "/uploadImgs"+File.separator+imgName);
		}else {
			System.out.println("upload img failed!");
			map.addAttribute("code", "400");
		}
		return map;
	}

}
