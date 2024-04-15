package com.javaproject.service;

import com.javaproject.Model.User;

public interface UserService {

	/*
	 * private String userName; private Long mobileNo; private String emailId;
	 * private String address; private int pinCode; private String password;
	 */

	public String registerUser(String userName, Long mobileNo, String emailId, String address, int pinCode,
			String password);

	public String registerUser(User user);

	public boolean isRegistered(String emailId);

	public String isValidCredential(String emailId, String password);

	public User getUserDetails(String emailId, String password);

	public String getFName(String emailId);

	public String getUserAddr(String userId);

}
