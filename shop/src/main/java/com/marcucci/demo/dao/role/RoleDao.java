package com.marcucci.demo.dao.role;

import java.util.List;

import com.marcucci.demo.orm.entities.role.Role;

public interface RoleDao {
	
	Role saveOrUpdateRole(Role role);
	
	Role getRoleById(long id);
	
	List<Role> findAllRoles();
	
	void deleteRole(Role role);
}
