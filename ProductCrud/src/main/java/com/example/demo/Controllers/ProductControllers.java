package com.example.demo.Controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.Product;

@RestController
@RequestMapping("product")
public class ProductControllers {

	private ArrayList<Product> products = new ArrayList<>();
	
	@PostMapping("add")
	public Product createProduct(@RequestBody Product newproduct) {
		Product productToCreate = new Product(newproduct.getName(), newproduct.getPrice(),
				newproduct.getDescription());
		this.products.add(productToCreate);
		return productToCreate;
	}
	
	@GetMapping("all")
	public ArrayList<Product> getAllUser(){
		return this.products;
	}
	
	@DeleteMapping("delete/{id}")
	public Boolean deleteUser(@PathVariable("id") int id) {
		for (Product newproduct : products) {
			if(newproduct.getId()==id) {
				return products.remove(newproduct);
			}
		}
		return false;
	}
	
	@PutMapping("update")
	public Boolean updateUser(@RequestBody Product newproduct) {
		
		for (Product product : products) {
			if(product.getId()==newproduct.getId()) {
				product.setName(newproduct.getName());
				product.setPrice(newproduct.getPrice());
				product.setDescription(newproduct.getDescription());
				return true;
			}
		}
		
		return false;
	}
}
