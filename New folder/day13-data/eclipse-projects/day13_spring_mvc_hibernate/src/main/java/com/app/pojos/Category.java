package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category extends BaseEntity {
	@Column(name = "category_name", length = 40, unique = true)
	private String categoryName;
	private String description;
//One to Many association between Category n Product
	// Category : one , parent , inverse
	@OneToMany(mappedBy = "productCategory",cascade = CascadeType.ALL,
			orphanRemoval = true /* ,fetch = FetchType.EAGER */ )
	private List<Product> products = new ArrayList<>();

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String description) {
		super();
		this.categoryName = categoryName;
		this.description = description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	// as Per the Founder's reco : add helper method to : establish a bi-dir asso
	// between the entities
	public void addProduct(Product p) {
		products.add(p); // parent ---> child
		p.setProductCategory(this);// child ---> parent
	}

	// as Per the Founder's reco : add helper method to : remove a bi-dir asso
	// between the entities
	public void removeProduct(Product p) {
		products.remove(p);
		p.setProductCategory(null);
	}

	// Project Tip : NEVER add any assocition based props in toString
	@Override
	public String toString() {
		return "Category " + getId() + " [categoryName=" + categoryName + ", description=" + description + "]";
	}

}
