package com.sample.practical.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sample.practical.model.Product;


public interface ProductRepository extends CrudRepository<Product, String>{
	

	

}
