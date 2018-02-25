package com.contentsale.service;

import java.util.List;

import com.contentsale.pojo.Contents;

public interface ContentService {
	Contents getContentById(Integer id);
	List<Contents> getAllContents();
}
