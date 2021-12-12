package com.technicaltask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.technicaltask.entity.Products;
import com.technicaltask.repo.Repo;


@RestController
public class Controller {
	
	@Autowired
	Repo r;
	
	@RequestMapping(value="/add_product",method=RequestMethod.POST)
	public String addProduct(@RequestBody Products p) {
		r.save(p);
		return "success";
	}
	@RequestMapping(value="view_product/{name}/{location}",method=RequestMethod.GET)
	public List<Products> viewProducts(@PathVariable("name") String name,@PathVariable("location") String location) {
		List<Products> p=r.findAllByNameAndLocation(name,location);
		return p; 
	}

}
