package com.marcucci.demo.orm.entities.role;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.marcucci.demo.orm.PersistenceCONST;
import com.marcucci.demo.orm.entities.AbstractPersistentEntity;
import com.marcucci.demo.orm.entities.user.User;

@Entity
@Table(name = PersistenceCONST.ROLE_TABLE_NAME)
public class Role extends AbstractPersistentEntity implements
Comparable<Role> {

	private static final long serialVersionUID = 1L;

	@Column(name = PersistenceCONST.ROLE_COLUMN_NAME, nullable = false, unique = true)
	private String name;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = PersistenceCONST.ROLE_MAPPEDBY)
	private List<User> users;
	
	@Column(name = PersistenceCONST.ROLE_COLUMN_DESCRIPTION, length = 16000, nullable = true)
	private String description;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int compareTo(Role role) {
		if (role.getId() > this.getId()) {
			return -1;

		} else if (role.getId() < this.getId()) {
			return 1;
		}
		return 0;
	}

}
