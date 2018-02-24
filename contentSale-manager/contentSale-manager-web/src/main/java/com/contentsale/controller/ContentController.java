package com.contentsale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contentsale.pojo.Contents;
import com.contentsale.service.ContentService;


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
