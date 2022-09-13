package tn.itbs.entities;

public class Commandes {
	private int id_command;
	private double price_command;
	
	public int getId_command() {
		return id_command;
	}
	public void setId_command(int id_command) {
		this.id_command = id_command;
	}
	public double getPrice_command() {
		return price_command;
	}
	public void setPrice_command(double price_command) {
		this.price_command = price_command;
	}
	public Commandes(int id_command, double price_command) {
		this.id_command = id_command;
		this.price_command = price_command;
	}

	public Commandes() {
	}
	@Override
	public String toString() {
		return "Commandes [id_command=" + id_command + ", price_command=" + price_command + "]";
	}

}
