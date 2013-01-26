package com.marcucci.demo.utils.md5;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * 
 * @author Jose Gonzalez Marcucci
 *
 */

public class CredentialsEncoder {
	
	/**
	 * This method encodes a text to MD5 to save in database
	 * @param password
	 * @return encoded password 
	 */
	public static String generateMD5(String password)
	{
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
   
		String hashedPass= encoder.encodePassword(password, null);
		
		return hashedPass;
	}

}
