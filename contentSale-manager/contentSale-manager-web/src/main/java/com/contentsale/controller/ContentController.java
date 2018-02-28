package com.contentsale.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contentsale.pojo.Contents;
import com.contentsale.pojo.User;
import com.contentsale.service.ContentService;
import com.contentsale.service.UserService;


/**
 * 内容管理Controller
 * 调用service层的接口控制业务流程
 * @author YQ
 *
 */
@Controller
public class ContentController {
	@Autowired
	private ContentService contentService;
	
	@Autowired
	private UserService userService;
	
	/**
	 * 默认页面内容展示
	 * 根据用户类型展示页面内容
	 * @param map
	 * @param request
	 * @param type
	 * @return
	 */
	@RequestMapping(value= {"/","/index",""})
	public String indexShow(Model map,HttpServletRequest request, HttpSession session,
			@RequestParam(value = "type", required = false) Integer type) {
		System.out.println("进入index");
		//内容获取
		List<Contents> productList = contentService.getAllContents();
		System.out.println("内容列表长度："+productList.size());
		map.addAttribute("productList", productList);
		//用户类型获取
		User user = (User) session.getAttribute("user");
		if(user == null) {
			type = 0;
			map.addAttribute("type", 0);
			map.addAttribute("user",null);
		}else {
			type = user.getUsertype() & 0xFF; //获取用户类型,Byte转int	
			map.addAttribute("type", type);
			map.addAttribute("user", user);
		}
		System.out.println("用户类型type："+type);
		return "index";
	}
	
	
	/**
	 * 内容查看页面
	 * @param id
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping("/show")
	public String detailShow(@RequestParam("id") int id,HttpSession session,Model map) {
		//根据内容ID获取内容
		Contents product = contentService.getContentById(id);
		map.addAttribute("product", product);
		//用户对象获取
		User user = (User) session.getAttribute("user");
		if(user == null) {
			map.addAttribute("type", 0);
			map.addAttribute("user",null);
		}else {
			Integer type = user.getUsertype() & 0xFF; //获取用户类型,Byte转int	
			map.addAttribute("type", type);
			map.addAttribute("user", user);
		}
		return "show";
	}
	
	/**
	 * 内容编辑页面
	 * @param id
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping("/edit")
	public String editContent(@RequestParam("id") int id,HttpSession session,Model map) {
		//获取用户信息
		User user = (User) session.getAttribute("user");
		if(user == null) { //未登录
			return "redirect:login";
		}
		int userType = user.getUsertype() & 0xFF; //获取用户类型,Byte转int	
		if(userType == 0) { //买家账号
			return "redirect:login";
		}
		//根据ID号获取content
		Contents content = contentService.getContentById(id);
		map.addAttribute("product", content);
		return "edit";
	}
	
	@RequestMapping("/editSubmit")
	public String editSubmit(@RequestParam("id") int id,@RequestParam("title") String title ,@RequestParam("summary") String summary ,
			@RequestParam("image") String image ,@RequestParam("detail") String detail,
			@RequestParam("price") Double price,HttpSession session,Model map) {
		//更新content表对应id内容
		contentService.updateContentById(id, title, summary, image, detail, price);
		//根据ID号获取content
		Contents content = contentService.getContentById(id);
		map.addAttribute("product", content);
		return "editSubmit";
	}

	/**
	 * 根据ID获取内容content页面
	 * @param contentId
	 * @return
	 */
	@RequestMapping("/content/{contentId}")
	@ResponseBody
	public Contents getContentById(@PathVariable(value="contentId") Integer contentId) {
		Contents content = contentService.getContentById(contentId);
		return content;
	}
	
}
