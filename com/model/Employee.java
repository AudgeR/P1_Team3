package com.model;

public class Employee {
	private int userId;
	private String username, password, firstName, lastName, isAdmin;
	
	public Employee() {
	}

	public Employee(int userID, String username, String password, String firstName, String lastName,
			String isAdmin) {
		super();
		this.userId = userID;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
	}

	public int getUserID() {
		return userId;
	}

	public void setUserID(int userID) {
		this.userId = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getIsAdmin() {
		return isAdmin;
	}
	
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "Employee [userID=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", isAdmin=" + isAdmin + "]";
	}
	
}
