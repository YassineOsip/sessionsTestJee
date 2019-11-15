package Entities;

public class User {
	
	private String userName;
	private String password;
	private boolean valid;
	private String data;

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "User [data=" + data + "]";
	}

	public void setData(String data) {
		this.data = data;
	}

	
	public  User(String userName , String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
