package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.dao.BlogTypeDao;
import com.blog.entity.BlogType;
import com.blog.service.BlogTypeService;

/**
 * ��������Serviceʵ����
 * @author Administrator
 *
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService{

	@Resource
	private BlogTypeDao blogTypeDao;
	
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}

	
}
