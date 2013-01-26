package com.marcucci.demo.orm.entities.user;

import java.util.Calendar;
import java.util.List;

import javax.persistence.*;

import com.marcucci.demo.orm.PersistenceCONST;
import com.marcucci.demo.orm.entities.AbstractPersistentEntity;
import com.marcucci.demo.orm.entities.role.Role;

@Entity
@Table(name = PersistenceCONST.USER_TABLE_NAME)
public class User extends AbstractPersistentEntity implements Comparable<User>
{
	private static final long serialVersionUID = 1L;

	@Column(name = PersistenceCONST.USER_COLUMN_ENABLED)
	private int enabled = 1;

	@Column(name = PersistenceCONST.USER_COLUMN_USERNAME, nullable = false, unique = true)
	private String username;

	@Column(name = PersistenceCONST.USER_COLUMN_EMAIL, nullable = true, unique = true)
	private String email;

	@Column(name = PersistenceCONST.USER_COLUMN_PASSWORD, nullable = false, unique = false)
	private String password;

	@Column(name = PersistenceCONST.USER_COLUMN_FIRST_NAME)
	private String firstName;

	@Column(name = PersistenceCONST.USER_COLUMN_LAST_NAME)
	private String lastName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false, nullable = false, columnDefinition = PersistenceCONST.TIMESTAMP)
	private Calendar creationDate; 

	@ManyToMany
	@JoinTable(name = PersistenceCONST.USER_ROLE_TABLE_NAME, 
	joinColumns = { @JoinColumn(name = PersistenceCONST.JOIN_ROLE, referencedColumnName = PersistenceCONST.USER_COLUMN_USERNAME) }, 
	inverseJoinColumns = { @JoinColumn(name = PersistenceCONST.JOIN_USER, referencedColumnName = PersistenceCONST.ROLE_COLUMN_NAME) })
	private List<Role> roles;
	

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public Calendar getCreationDate()
	{
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate)
	{
		this.creationDate = creationDate;
	}

	public List<Role> getRoles()
	{
		return roles;
	}

	public void setRoles(List<Role> roles)
	{
		this.roles = roles;
	}

	public int getEnabled()
	{
		return enabled;
	}

	public void setEnabled(int enabled)
	{
		this.enabled = enabled;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(User user)
	{
		if (user.getId() > getId())
		{
			return -1;

		}
		else if (user.getId() < getId())
		{
			return 1;
		}
		return 0;
	}

}
