package com.lz.service;

import com.lz.domain.Permission;

import java.util.List;

/**
 * PermissionService class
 *
 * @author wjh
 * @date 2018/10/23
 */

public interface PermissionService extends BaseService<Permission>{
	List<Permission> findPermissionByUserId(int id);

}
