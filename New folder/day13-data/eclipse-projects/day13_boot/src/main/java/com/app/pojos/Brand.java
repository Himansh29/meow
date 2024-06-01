package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {
	@Column(name = "brand_name", unique = true, length = 40)
	private String brandName;
	@Column(name = "launch_date")
	private LocalDate launchDate;
	@Column(name = "popularity_index")
	private int popularityIndex;
	// many-many : many , parent , inverse
	@ManyToMany(mappedBy = "brands")
	private Set<Product> products = new HashSet<>();

	public Brand() {

	}

	public Brand(String brandName, LocalDate launchDate, int popularityIndex) {
		super();
		this.brandName = brandName;
		this.launchDate = launchDate;
		this.popularityIndex = popularityIndex;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public LocalDate getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(LocalDate launchDate) {
		this.launchDate = launchDate;
	}

	public int getPopularityIndex() {
		return popularityIndex;
	}

	public void setPopularityIndex(int popularityIndex) {
		this.popularityIndex = popularityIndex;
	}
	

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
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
		Brand other = (Brand) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Brand " + getId() + " [brandName=" + brandName + ", launchDate=" + launchDate + ", popularityIndex="
				+ popularityIndex + "]";
	}

}
