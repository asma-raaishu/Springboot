package com.java.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.springbootcrud.product.Product;
import com.java.springbootcrud.service.ProductService;
@RestController
public class ProductController {

	@Autowired
	public ProductService ps;
	@RequestMapping("/products")
	public List<Product> getAllProduct()
	{
		return ps.getAllProduct();
		
	}
	@PostMapping("/products")
	public void createProduct(@RequestBody Product p)
	{
		ps.createProduct(p);
	}
	@PutMapping("/products/{p_Id}")
	public void updateProduct(@PathVariable int p_Id,@RequestBody Product p)
	{
		ps.updateProduct(p_Id,p);
	}
	@DeleteMapping("/products/{}p_Id")
	public void deleteProduct(@PathVariable int p_Id)
	{
		ps.deleteProduct(p_Id);
	}

}


