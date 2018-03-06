package com.contentsale.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.contentsale.pojo.BuyInfo;
import com.contentsale.pojo.Contents;
import com.contentsale.pojo.User;
import com.contentsale.service.ContentService;
import com.contentsale.service.UserService;
import com.contentsale.service.UserShoppingRecordService;

//Ajax异步传输接口
@Controller
@RequestMapping(value = "/api")
public class ApiController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserShoppingRecordService shoppingRecordService;
	
	@Autowired
	private ContentService contentService;
	
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(@RequestParam("userName") String userName,@RequestParam("password")String password,
			Model map,HttpServletResponse response,HttpSession session){
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
	
	/**
	 * 内容购买，添加购买记录至用户购买记录表
	 * @param id 内容ID
	 * @param num 购买数量
	 */
	@RequestMapping("/buy")
	@ResponseBody
	public Model buyProduct(@RequestBody List<BuyInfo> buyInfo,HttpSession session,Model map) {
		//用户信息获取
		User user = (User) session.getAttribute("user");
		if(user != null) {
			int userId = user.getId();
			System.out.println("进入购买方法，保存购买记录....");
			System.out.println("购买内容数量："+buyInfo.size());
			//保存每条内容购买信息
			for(BuyInfo ele:buyInfo) { 
				System.out.println(ele.getId()+", "+ele.getNumber());
				int contentId = ele.getId();
				int buyNum = ele.getNumber();
				//购买内容信息获取
				Contents content = contentService.getContentById(contentId);
				Double buyPrice = content.getPrice();
				//购买时间设置
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
				String buytime = df.format(new Date());
				//保存购买信息
				shoppingRecordService.saveShoppingRecord(contentId, userId, buyPrice, buyNum, buytime);
				map.addAttribute("code", "200");
			}
		}
		
		return map;
	}
	
	/**
	 * 卖家删除未售出内容
	 * @param id 内容id
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public Model deleteContent(@RequestParam("id")int id,HttpSession session,Model map) {
		contentService.deleteContentById(id);
		map.addAttribute("code", "200");
		map.addAttribute("result", true);
		map.addAttribute("message", "success");
		return map;
	}

}
