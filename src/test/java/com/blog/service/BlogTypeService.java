package com.blog.service;

import java.util.List;

import com.blog.entity.BlogType;

/**
 * ��������Service�ӿ�
 * @author Administrator
 *
 */
public interface BlogTypeService {

	/**
	 * ��ѯ���в������ͣ��Լ���Ӧ�Ĳ�������
	 * @return
	 */
	public List<BlogType> countList();
}
