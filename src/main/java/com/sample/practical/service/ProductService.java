package com.sample.practical.service;

import com.sample.practical.model.Product;

public interface ProductService {

	public Iterable<Product> getAllProducts();
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public void deleteProduct(int id);
}
