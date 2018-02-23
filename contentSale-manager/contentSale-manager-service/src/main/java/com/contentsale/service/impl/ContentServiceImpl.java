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
	@Override
	public Contents getContentById(Integer contentId) {
		
//		Contents content = contentsMapper.selectByPrimaryKey(contentId);
		ContentsExample example = new ContentsExample();
		//添加查询条件,用户自定义查询条件
		Criteria criteria = example.createCriteria();
		criteria.andContentIdEqualTo(contentId);
		List<Contents> list = contentsMapper.selectByExample(example);
		if(list != null && list.size()>0) {
			Contents content = list.get(0);
			return content;
		}
		return null;
	}

}
