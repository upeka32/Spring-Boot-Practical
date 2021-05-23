package com.sample.practical.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.practical.model.Product;
import com.sample.practical.serviceImpl.ProductServiceImpl;

public interface ProductService {

	public Iterable<Product> getAllProducts();
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
}
