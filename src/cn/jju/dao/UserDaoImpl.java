package cn.jju.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.jju.pojo.User;

public class UserDaoImpl implements UserDao{
	
	private SqlSessionFactory sessionFactory;

	public UserDaoImpl(SqlSessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sessionFactory.openSession();
		User user = sqlSession.selectOne("test.findUserById", 1);
		sqlSession.close();
		return user;
	}

}
