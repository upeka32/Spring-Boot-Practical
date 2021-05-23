package com.sample.practical.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "product")
public class Product {
	
	@Id
	private int productId;  
	
	@Column(name="name")
	private String name;
	
	@Column(name= "description") 
	private String description;
	
	@Column(name= "price") 
	private double price;
	
	@Column(name= "status") 
	private String status;
	
	@Column(name= "launch_date") 
	private Date date;
	
//	@ManyToOne
//    @JoinColumn(name="product_category_id", nullable=false , columnDefinition = "int default 100")
//    private ProductCategory productCategory;

	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
//
//	public ProductCategory getProductCategory() {
//		return productCategory;
//	}
//
//	public void setProductCategory(ProductCategory productCategory) {
//		this.productCategory = productCategory;
//	}
	
	

}
