package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.models.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {

	
}
