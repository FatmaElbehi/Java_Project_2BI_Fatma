package tn.itbs.entities;

public class Client extends User {

	private int id_client;
	private String cin_client;
	private String firstname_client;
	private String lastname_client;
	private String adresse_client;
	private String tel_client;
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public String getCin_client() {
		return cin_client;
	}
	public void setCin_client(String cin_client) {
		this.cin_client = cin_client;
	}
	public String getFirstname_client() {
		return firstname_client;
	}
	public void setFirstname_client(String firstname_client) {
		this.firstname_client = firstname_client;
	}
	public String getLastname_client() {
		return lastname_client;
	}
	public void setLastname_client(String lastname_client) {
		this.lastname_client = lastname_client;
	}
	public String getAdresse_client() {
		return adresse_client;
	}
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}
	public String getTel_client() {
		return tel_client;
	}
	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}
	
	public Client() {
		super();
	}
	
	public Client(int id_user, String email_user, String password_user, String type_user, int id_client,
			String cin_client, String firstname_client, String lastname_client, String adresse_client,
			String tel_client) {
		super(id_user, email_user, password_user, type_user);
		this.id_client = id_client;
		this.cin_client = cin_client;
		this.firstname_client = firstname_client;
		this.lastname_client = lastname_client;
		this.adresse_client = adresse_client;
		this.tel_client = tel_client;
	}
	@Override
	public String toString() {
		return "Client [id_client=" + id_client + ", cin_client=" + cin_client + ", firstname_client="
				+ firstname_client + ", lastname_client=" + lastname_client + ", adresse_client=" + adresse_client
				+ ", tel_client=" + tel_client + "]";
	}
	
	
}
