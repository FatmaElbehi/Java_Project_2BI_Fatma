package tn.itbs.entities;

import java.util.ArrayList;

public class Categories {

	private int id_cat;
	private String name_cat;
	private String description_cat;
	private ArrayList<Products> Products;
	
	
	
	
	public ArrayList<Products> getProducts() {
		return Products;
	}
	public void setProducts(ArrayList<Products> products) {
		Products = products;
	}
	public int getId_cat() {
		return id_cat;
	}
	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}
	public String getName_cat() {
		return name_cat;
	}
	public void setName_cat(String name_cat) {
		this.name_cat = name_cat;
	}
	public String getDescription_cat() {
		return description_cat;
	}
	public void setDescription_cat(String description_cat) {
		this.description_cat = description_cat;
	}
	
	
	
	public Categories(int id_cat, String name_cat, String description_cat,
			ArrayList<Products> products) {
		this.id_cat = id_cat;
		this.name_cat = name_cat;
		this.description_cat = description_cat;
		Products = new ArrayList<Products>();
	}
	public Categories() {

	}
	@Override
	public String toString() {
		return "Categories [id_cat=" + id_cat + ", name_cat=" + name_cat + ", description_cat=" + description_cat
				+ ", Products=" + Products + "]";
	}
	
}
