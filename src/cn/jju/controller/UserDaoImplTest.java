package cn.jju.controller;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.jju.dao.UserDao;
import cn.jju.dao.UserDaoImpl;
import cn.jju.pojo.User;

public class UserDaoImplTest {
	
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void setUp() throws Exception{
		 String resource = "SqlConfig.xml";    
	        Reader reader = Resources.getResourceAsReader(resource);    
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);  
	}
	
	@Test
	public void findUserByIdTest() throws Exception{
		UserDao userDao = new UserDaoImpl(sqlSessionFactory);
		User user = userDao.findUserById(1);
		System.out.println(user);
	}
}
