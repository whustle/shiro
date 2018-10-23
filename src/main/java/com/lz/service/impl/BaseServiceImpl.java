package com.lz.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lz.service.BaseService;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * BaseServiceImpl class
 *
 * @author wjh
 * @date 2018/10/23
 */

public abstract class BaseServiceImpl<T> implements BaseService<T> {
    protected abstract Mapper<T> getMapper();

	@Override
	public void save(T t) {
		getMapper().insert(t);
	}

	@Override
	public T findById(Integer id) {
		return getMapper().selectByPrimaryKey(id);
	}

	@Override
	public List<T> findAll() {
		return getMapper().selectAll();
	}

	@Override
	public void deleteById(Integer id) {
		getMapper().deleteByPrimaryKey(id);
	}

	@Override
	public void update(T t) {
		getMapper().updateByPrimaryKey(t);
	}

	@Override
	public PageInfo<T> findByPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<T> tList = findAll();
		PageInfo<T> pageInfo=new PageInfo<>(tList);
		return pageInfo;
	}
}
