package com.marcucci.demo.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marcucci.demo.dao.DaoCONST;
import com.marcucci.demo.dao.impl.DaoImpl;
import com.marcucci.demo.orm.entities.user.User;

@Repository(value = DaoCONST.USER_REPOSITORY)
@Transactional
public class UserDaoImpl extends DaoImpl<User> implements UserDao {
	
	public User saveOrUpdateUser(User user) {
		return saveOrUpdate(user);
	}
	
	public User getUserById(long id) {
		return findById(id);
	}

	public void deleteUser(User user) {
		delete(user);
		
	}

	public List<User> findAllUsers() {
		return findAll();
	}

}
