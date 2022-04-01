package com.java.springbootcrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.springbootcrud.product.Product;
import com.java.springbootcrud.repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	public ProductRepository pr;
	public List<Product> getAllProduct()
	{
		List<Product> p=new ArrayList<>();
		pr.findAll().forEach(p::add);
		return p;
	
	}
	public void createProduct(Product p) {
		pr.save(p);
		
		
	}
	public void updateProduct(int p_Id, Product p) {
		pr.save(p);
		
	}
	public void deleteProduct(int p_Id) {
		pr.deleteById(p_Id);

		
	}
	


}
