package com.lz.service;

import com.lz.domain.User;

/**
 * UserService class
 *
 * @author wjh
 * @date 2018/10/23
 */

public interface UserService extends BaseService<User>{
	User findUserByUserName(String username);
}
