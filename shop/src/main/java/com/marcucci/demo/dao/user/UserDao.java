package com.marcucci.demo.dao.user;

import java.util.List;

import com.marcucci.demo.orm.entities.user.User;

public interface UserDao {
	
	User saveOrUpdateUser(User user);
	
	User getUserById(long id);
	
	void deleteUser(User user);
	
	List<User> findAllUsers();

}
