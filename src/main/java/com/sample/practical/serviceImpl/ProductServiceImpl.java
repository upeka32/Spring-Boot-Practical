package com.sample.practical.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.practical.model.Product;
import com.sample.practical.repository.ProductRepository;
import com.sample.practical.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepo;
	
	public Iterable<Product> getAllProducts(){
		return productRepo.findAll();
	}
	
	public Product addProduct(Product product){
		return productRepo.save(product);
	}
	
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}
	
	public void deleteProduct(int id) {
	
		productRepo.deleteProductById(id);
		
	}
	
}
