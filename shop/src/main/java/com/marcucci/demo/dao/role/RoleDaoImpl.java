package com.marcucci.demo.dao.role;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.marcucci.demo.dao.DaoCONST;
import com.marcucci.demo.dao.impl.DaoImpl;
import com.marcucci.demo.orm.entities.role.Role;

@Repository(value = DaoCONST.ROLE_REPOSITORY)
@Transactional
public class RoleDaoImpl extends DaoImpl<Role> implements RoleDao {

	public Role saveOrUpdateRole(Role role) {
		return saveOrUpdate(role);
	}
	
	public Role getRoleById(long id) {
		return findById(id);
	}
	
	public List<Role> findAllRoles() {
		return findAll();
	}

	public void deleteRole(Role role) {
		delete(role);	
	}
}
