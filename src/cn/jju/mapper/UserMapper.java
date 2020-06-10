package cn.jju.mapper;

import cn.jju.pojo.User;

public interface UserMapper {

	public User findUserById(int id) throws Exception;
}
