package com.lz.dao;

import com.lz.domain.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User> {
	User findUserByUserName(String username);
}
