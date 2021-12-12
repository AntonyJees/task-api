package com.technicaltask.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.technicaltask.entity.Products;
import com.technicaltask.repo.Repo;

public class Services {

		@Autowired
		private Services s;
		
		@Autowired
		Repo r;
		
		public Products addProducts(Products p) {
			r.save(p);
			return p;
		}
}
