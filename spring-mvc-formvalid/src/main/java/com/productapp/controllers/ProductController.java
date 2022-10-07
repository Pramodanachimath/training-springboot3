package com.productapp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productapp.model.Product;

@Controller
public class ProductController {
	@RequestMapping("/showForm")
	public String addProducts() {
		return "addform";
	}
	
	@RequestMapping("/addProduct")
	public String addForm(@Valid Product product,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result.getErrorCount());
			System.out.println(result.getAllErrors());
			return "addform";
		}
		return  "success";
	}

}
