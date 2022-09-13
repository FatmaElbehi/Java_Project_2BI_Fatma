package tn.itbs.entities;

public class Products {

	private int id_product;
	private String name_product;
	private double price;
	private Categories category;
	private String description;
	private boolean disponibility;
	
	public int getId_product() {
		return id_product;
	}
	public void setId_product(int id_product) {
		this.id_product = id_product;
	}
	public String getName_product() {
		return name_product;
	}
	public void setName_product(String name_product) {
		this.name_product = name_product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Categories getCategory() {
		return category;
	}
	public void setCategory(Categories category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDisponibility() {
		return disponibility;
	}
	public void setDisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}
	public Products(int id_product, String name_product, double price, Categories category, String description,
			boolean disponibility) {
		this.id_product = id_product;
		this.name_product = name_product;
		this.price = price;
		this.category = category;
		this.description = description;
		this.disponibility = disponibility;
	}
	
	public Products() {
	}
	
	@Override
	public String toString() {
		return "Products [id_product=" + id_product + ", name_product=" + name_product + ", price=" + price
				+ ", category=" + category + ", description=" + description + ", disponibility=" + disponibility + "]";
	}

}
