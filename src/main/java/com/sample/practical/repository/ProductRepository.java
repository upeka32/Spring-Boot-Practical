package com.sample.practical.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sample.practical.model.Product;


public interface ProductRepository extends CrudRepository<Product, String>{
	
	@Modifying
	@Transactional
	@Query("UPDATE Product SET status='D' WHERE product_id=:product_id")
	public void deleteProductById(@Param(value="product_id") int productId);
	
	
	
}
