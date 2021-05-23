package com.sample.practical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.practical.model.Product;
import com.sample.practical.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public Product addStudent(@RequestBody Product product){
		return productService.addProduct(product);
	}

	@GetMapping("/productList")
	public Iterable<Product> getAllStudent() {
		return productService.getAllProducts();
	}
	

	@PutMapping("/updateProduct")
	public void updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
	}
	

}
