package com.blog.service;

import java.util.List;
import java.util.Map;

import com.blog.entity.Link;

/**
 * ��������Service�ӿ�
 * @author Administrator
 *
 */
public interface LinkService {

	/**
	 * ��������������Ϣ
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);
}
