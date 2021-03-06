package com.sample.practical.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "product_category")
public class ProductCategory {
	
	@Id
	@Column(name="product_category_id")
	private int categoryId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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

}

