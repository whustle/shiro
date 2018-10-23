package com.lz.service.impl;

import com.lz.dao.UserDao;
import com.lz.domain.User;
import com.lz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * UserServiceImpl class
 *
 * @author wjh
 * @date 2018/10/23
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	protected Mapper<User> getMapper() {
		return this.userDao;
	}
}
