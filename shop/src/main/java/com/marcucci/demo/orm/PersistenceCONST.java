package com.marcucci.demo.orm;

public interface PersistenceCONST {

	/** User Entity */
	public static final String USER_TABLE_NAME = "users"; 
	
	public static final String JOIN_ROLE = "username";
	
	public static final String USER_ROLE_TABLE_NAME = "authorities";
	
	public static final String USER_COLUMN_ENABLED = "enabled";
	
	public static final String USER_COLUMN_USERNAME = "username";
	
	public static final String USER_COLUMN_EMAIL = "email";
	
	public static final String USER_COLUMN_PASSWORD = "password";
	
	public static final String USER_COLUMN_FIRST_NAME = "first_name";
		
	public static final String USER_COLUMN_LAST_NAME = "last_name";
	
	/** Role Entity */
	
	public static final String ROLE_TABLE_NAME = "role";
	
	public static final String ROLE_MAPPEDBY = "roles";
	
	public static final String JOIN_USER = "authority";
	
	public static final String ROLE_COLUMN_NAME = "name";
	
	public static final String ROLE_COLUMN_DESCRIPTION = "description";
	
	/** Common */
	
	public static final String ENTITY_ID_COLUMN = "id";
	
	public static final String ENTITY_VERSION_COLUMN = "VERSION";
	
	public static final String TIMESTAMP = "TIMESTAMP";

}
