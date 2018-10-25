package com.lz.dao;

import com.lz.domain.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User> {
	@Select("select * from t_user where user_name=#{username}")
	User findUserByUserName(String username);
}
