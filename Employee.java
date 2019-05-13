package Models;

public class Employee {
	
	String userName, passWord, firstName, lastName;
	int userID;

	public Employee() {
		
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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

	@Override
	public String toString() {
		return "Employee [userID=" + userID + ", userName=" + userName + ", passWord=" + passWord + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	public Employee(String userName, int userID, String passWord, String firstName, String lastName) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
