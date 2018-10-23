package com.lz.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * BaseService class
 *
 * @author wjh
 * @date 2018/10/23
 */

public interface BaseService<T> {
	T findById(Integer id);
	List<T> findAll();
	void deleteById(Integer id);
	void update(T t);
	void save(T t);
	PageInfo<T> findByPage(Integer pageNum, Integer pageSize);
}
