package tn.itbs.entities;

public class User {
	private int id_user;
	private String email_user;
	private String password_user;
	private String type_user;
	
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getEmail_user() {
		return email_user;
	}
	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}
	public String getPassword_user() {
		return password_user;
	}
	public void setPassword_user(String password_user) {
		this.password_user = password_user;
	}
	public String getType_user() {
		return type_user;
	}
	public void setType_user(String type_user) {
		this.type_user = type_user;
	}
	public User(int id_user, String email_user, String password_user, String type_user) {
		this.id_user = id_user;
		this.email_user = email_user;
		this.password_user = password_user;
		this.type_user = type_user;
	}
	public User() {
	}
	
	
	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", email_user=" + email_user + ", password_user=" + password_user
				+ ", type_user=" + type_user + "]";
	}

}
