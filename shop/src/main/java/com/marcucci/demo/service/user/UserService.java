package com.marcucci.demo.service.user;

import java.util.List;

import com.marcucci.demo.orm.entities.user.User;

public interface UserService {

	User saveOrUpdateUser(User user);
	
	User getUserById(long id);
	
	void deleteUser(User user);
	
	List<User> findAllUsers();
}
