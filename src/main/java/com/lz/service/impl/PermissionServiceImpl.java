package com.lz.service.impl;

import com.lz.dao.PermissionDao;
import com.lz.domain.Permission;
import com.lz.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * PermissionServiceImpl class
 *
 * @author wjh
 * @date 2018/10/23
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission> implements PermissionService {
	@Autowired
	private PermissionDao permissionDao;
	@Override
	protected Mapper<Permission> getMapper() {
		return this.permissionDao;
	}

	@Override
	public List<Permission> findPermissionByUserId(int id) {
		List<Permission> list = permissionDao.findPerssionByUserId(id);
		return list;
	}
}
