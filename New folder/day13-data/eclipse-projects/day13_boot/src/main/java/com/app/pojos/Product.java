package com.app.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * name,price,description,inStock  + category_id(FK --> references category id from categories)
 */
@Entity
@Table(name="products")
public class Product extends BaseEntity {
	@Column(name="product_name",length = 40,unique = true)
	private String productName;
	private double price;
	private String description;
	@Column(name="in_stock")
	private boolean inStock;
	//Many to One asso between Product *--->1 Category
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category productCategory;
	//add many-many association between Product n Brand Product *<---->* Brand
	//Product : many , parent , owning
	@ManyToMany //MANDATORY --o.w MappingException
	@JoinTable(name = "product_brands",joinColumns = @JoinColumn(name="product_id"),
	inverseJoinColumns = @JoinColumn(name="brand_id"))
	//Above anno : optional BUT reco to specify -- name of join table n col names
	private Set<Brand> brands=new HashSet<>();
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, double price, String description) {
		super();
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.inStock = true;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public Category getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(Category productCategory) {
		this.productCategory = productCategory;
	}
	
	public Set<Brand> getBrands() {
		return brands;
	}
	public void setBrands(Set<Brand> brands) {
		this.brands = brands;
	}
	@Override
	public String toString() {
		return "Product "+getId()+" [productName=" + productName + ", price=" + price + ", description=" + description
				+ ", inStock=" + inStock + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		return true;
	}
	
	

}
