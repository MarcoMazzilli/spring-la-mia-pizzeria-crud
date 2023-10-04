package org.java.db.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String description;
	private String photo;
	private float price;
	
	public Pizza() {};
	public Pizza(String name, String description, String photo, float price) {
		
		setName(name);
		setDescription(description);
		setPhoto(photo);
		setPrice(price);
	}
	
	//	GETTER SETTER
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "id" + getId() + "\n" +
				"name" + getName() + "\n" +
				"price" + getPrice() + "\n" +
				"description" + getDescription() + "\n";
	}
	
	
}
