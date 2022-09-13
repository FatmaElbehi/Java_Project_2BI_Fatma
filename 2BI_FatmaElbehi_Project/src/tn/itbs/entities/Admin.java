package tn.itbs.entities;

public class Admin extends User{
	
	private int id_admin;
	private String name_admin;
	public int getId_admin() {
		return id_admin;
	}
	
	public void setId_admin(int id_admin) {
		this.id_admin = id_admin;
	}
	public String getName_admin() {
		return name_admin;
	}
	public void setName_admin(String name_admin) {
		this.name_admin = name_admin;
	}

	public Admin(int id_user, String email_user, String password_user, String type_user, int id_admin,
			String name_admin) {
		super(id_user, email_user, password_user, type_user);
		this.id_admin = id_admin;
		this.name_admin = name_admin;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [id_admin=" + id_admin + ", name_admin=" + name_admin + "]";
	}


}
