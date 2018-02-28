package com.contentsale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contentsale.mapper.ContentsMapper;
import com.contentsale.pojo.Contents;
import com.contentsale.pojo.ContentsExample;
import com.contentsale.pojo.ContentsExample.Criteria;
import com.contentsale.service.ContentService;

/**
 * 内容管理Service
 * @author YQ
 */
@Service
public class ContentServiceImpl implements ContentService {
	
	@Autowired
	private ContentsMapper contentsMapper;//注入接口代理对象
	
	
	
	
	/**
	 * 获取全部内容Content
	 */
	@Override
	public List<Contents> getAllContents() {
		ContentsExample example = new ContentsExample();
		List<Contents> list = contentsMapper.selectByExample(example);
		if(list != null && list.size() > 0) {
			return list;
		}
		return null;
	}
	
	/**
	 * 根据ID获取对应的内容content
	 */
	@Override
	public Contents getContentById(Integer contentId) {
		
//		Contents content = contentsMapper.selectByPrimaryKey(contentId);
		ContentsExample example = new ContentsExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(contentId);
		List<Contents> list = contentsMapper.selectByExample(example);
		if(list != null && list.size()>0) {
			Contents content = list.get(0);
			return content;
		}
		return null;
	}
	
	/**
	 * 数据表插入一条内容
	 */
	@Override
	public void insertContent(Contents content) {
		int record = contentsMapper.insert(content);
	}
	
	/**
	 * 更新对应id内容
	 */
	@Override
	public void updateContentById(Integer id, String title, String summary, 
			String image, String detail, Double price) {
		// TODO Auto-generated method stub
		ContentsExample example = new ContentsExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		Contents content = new Contents();
		content.setId(id);
		content.setDetail(detail);
		content.setPic(image);
		content.setPrice(price);
		content.setSummary(summary);
		content.setTitle(title);
		contentsMapper.updateByExample(content, example);
	}
	

}
