package com.sample.practical.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.practical.model.Product;
import com.sample.practical.repository.ProductRepository;


@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	List<Product> productList = new ArrayList<Product>();
	
	public Iterable<Product> getAllProducts(){
		System.out.println("get all products");
		return productRepo.findAll();
	}
	
	public Product addProduct(Product product){
		System.out.println("product added");
		return productRepo.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}
	
}
