package com.sample.practical.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.practical.model.Product;
import com.sample.practical.repository.ProductRepository;
import com.sample.practical.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

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
	
	public void deleteProduct(int id) {
	
		productRepo.deleteProduct(id);
		System.out.println("delete service");
		
	}
	
}
