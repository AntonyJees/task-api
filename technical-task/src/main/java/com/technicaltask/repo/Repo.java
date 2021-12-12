package com.technicaltask.repo;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.technicaltask.entity.Products;

public interface Repo extends MongoRepository<Products, Integer> {

	
	List<Products> findAllByNameAndLocation(String name,String location);
}
