package com.lz.dao;

import com.lz.domain.Permission;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * PermissionDao class
 *
 * @author wjh
 * @date 2018/10/23
 */

public interface PermissionDao extends Mapper<Permission> {
	List<Permission> findPerssionByUserId(int id);
}
