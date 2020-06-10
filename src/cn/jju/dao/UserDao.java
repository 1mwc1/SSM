package cn.jju.dao;

import cn.jju.pojo.User;

public interface UserDao {

	public User findUserById(int id) throws Exception;
}
