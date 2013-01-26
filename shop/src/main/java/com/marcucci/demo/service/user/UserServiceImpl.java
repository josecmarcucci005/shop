package com.marcucci.demo.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcucci.demo.dao.user.UserDao;
import com.marcucci.demo.orm.entities.user.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public User saveOrUpdateUser(User user) {
		return dao.saveOrUpdateUser(user);
	}

	public User getUserById(long id) {
		return dao.getUserById(id);
	}

	public void deleteUser(User user) {
		dao.deleteUser(user);
		
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}
	
}
