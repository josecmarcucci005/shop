package com.marcucci.demo.service.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcucci.demo.dao.role.RoleDao;
import com.marcucci.demo.orm.entities.role.Role;

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao dao;
	
	public Role saveOrUpdateRole(Role role) {
		return dao.saveOrUpdateRole(role);
	}

	public Role getRoleById(long id) {
		return dao.getRoleById(id);
	}

	public List<Role> findAllRoles() {
		return dao.findAllRoles();
	}

	public void deleteRole(Role role) {
		dao.deleteRole(role);
	}

}
