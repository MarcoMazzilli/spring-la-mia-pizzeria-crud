package org.java.db.pojo;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	@NotBlank(message = "Il nome e un campo obbligatorio")
	@Length(
			max = 100, 
			message = "il nome non puo' contenere piu di 100 caratteri"
		)
	private String name;

	@Column(nullable = false)
	@NotBlank(message = "La descrizione e un campo obbligatiorio")
	@Length(
			max = 255,
			message = "la descrizione non puo' contenere piu di 255 caratteri"
			)
	private String description;

	@Column(nullable = false)
	@NotBlank(message = "La foto e un campo obbligatiorio")
	private String photo;

	@Column(nullable = false)
	@NotNull(message = "Il prezzo e un campo obbligatiorio")
	private float price;

	
	public Pizza() {}
	public Pizza(String name, String description, String photo, float price) throws Exception {

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
	public String getFormattedPrice() {
		
		String formattedPrice = String.format("%.2f", price);
		return formattedPrice;
	}
	public void setPrice(float price) throws Exception {
		if (price < 0.5f) {
			throw new Exception("price must be above 0.5");
		}
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
