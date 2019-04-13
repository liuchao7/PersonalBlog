package com.blog.dao;

import java.util.List;
import java.util.Map;

import com.blog.entity.Comment;

/**
 * ����Dao�ӿ�
 * @author Administrator
 *
 */
public interface CommentDao {

	/**
	 * ��ѯ�û�������Ϣ
	 * @param map
	 * @return
	 */
	public List<Comment> list(Map<String,Object> map);
	
	/**
	 * ��������
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
	
	/**
	 * ��ȡ�ܼ�¼��
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
}