package com.contentsale.controller;

import java.util.ArrayList;
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
import com.contentsale.pojo.Product;
import com.contentsale.pojo.User;
import com.contentsale.pojo.UserShoppingRecord;
import com.contentsale.service.ContentService;
import com.contentsale.service.ProductService;
import com.contentsale.service.UserService;
import com.contentsale.service.UserShoppingRecordService;


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
	
	@Autowired
	private UserShoppingRecordService shoppingRecordService;
	
	@Autowired
	private ProductService productService;
	
	/**
	 * 默认页面内容展示
	 * 根据用户类型展示页面内容
	 * @param map
	 * @param request
	 * @param type 0:所有内容展示 1：未购买内容展示
	 * @return
	 */
	@RequestMapping(value= {"/","/index",""})
	public String indexShow(Model map,HttpServletRequest request, HttpSession session,
			@RequestParam(value = "type", required = false) Integer type) {
		//用户类型获取
		User user = (User) session.getAttribute("user");
		if(user == null) {
			map.addAttribute("user",null);
			return "redirect:login";
		}else {
			map.addAttribute("user", user);
		}
		//内容获取
		List<Contents> contents = contentService.getAllContents();
		List<Product> productList = new ArrayList<Product>();
		List<Product> unBuyedList = new ArrayList<Product>();
		for(Contents content:contents) {
			//判断该内容当前用户是否购买
			boolean isBuy = shoppingRecordService.isContentBuyed(content.getId(), user.getId());
//			System.out.println("conent title:"+content.getTitle()+"当前用户是否购买："+isBuy);
			//获取内容售出数量
			int sellNum = shoppingRecordService.contentSellNum(content.getId());
			boolean isSell = false;
			if(sellNum != 0) {
				isSell = true;
			}
			Product product = productService.AssignProductAttr(content, isBuy, isSell,sellNum);
			productList.add(product);
			if(!isBuy) {
				unBuyedList.add(product);
			}
		}
		if(type == null) {
			map.addAttribute("productList", productList);
		}else {
			map.addAttribute("productList", unBuyedList);
		}
		return "index";
	}
	
	
	/**
	 * 内容查看页面
	 * @param id 内容ID号
	 * @param session
	 * @param map
	 * @return
	 */
	@RequestMapping("/show")
	public String detailShow(@RequestParam("id") int id,HttpSession session,Model map) {
		//用户对象获取
		User user = (User) session.getAttribute("user");
		if(user == null) {
			return "redirect:login";
		}else {
			map.addAttribute("user", user);
		}
		//根据内容ID获取内容
		Contents content = contentService.getContentById(id);
		System.out.println("content detail:"+content.getDetail());
		//当前用户购买记录获取
		UserShoppingRecord record = shoppingRecordService.getShoppingRecordByContentId(id,user.getId());
		if(record == null) { //未购买过
			Product product = productService.AssignProductAttr(content, false, false, 0, null, null);
			map.addAttribute("product", product);
			System.out.println("product detail:"+product.getDetail());
		}else {//购买过
			int buyNum = record.getBuynum();
			Double buyPrice = record.getBuyprice();
			String buyTime = record.getBuytime();
			//赋值product交互对象
			Product product = productService.AssignProductAttr(content, true, true, buyNum, buyPrice, buyTime);
			System.out.println("product detail:"+product.getDetail());
			map.addAttribute("product", product);
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
