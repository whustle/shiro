package com.lz.service.impl;

import com.lz.dao.RoleDao;
import com.lz.domain.Role;
import com.lz.service.BaseService;
import com.lz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * RoleServiceImpl class
 *
 * @author wjh
 * @date 2018/10/23
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
	@Autowired
	private RoleDao roleDao;
	@Override
	protected Mapper<Role> getMapper() {
		return this.roleDao;
	}
}
