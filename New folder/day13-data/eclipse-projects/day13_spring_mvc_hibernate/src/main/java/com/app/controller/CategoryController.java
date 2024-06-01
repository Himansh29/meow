package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.CategoryService;

@Controller
@RequestMapping("/category") // optional BUT rec for separation
public class CategoryController {
	//dep : service layer i/f
	@Autowired
	private CategoryService categoryService;
	
	public CategoryController() {
		System.out.println("in ctor of " + getClass());
	}
	@PostConstruct
	public void myInit()
	{
		System.out.println("in init "+categoryService);
	}
	//add req handling method to display all catgeories
	@GetMapping("/display")
	public String listAllCatgeories(Model map)
	{
		System.out.println("in list categories "+map);//{}
		map.addAttribute("category_list", categoryService.getCategories());
		return "/category/display";//Handler rets ---> LVN + model attr --> D.S --> LVN --> V.R
		//AVN : /WEB-INF/views/category/display.jsp  ---> D.S --> stores model attr under request scope 
		//forwards the clnt to view layer : JSP : EL syntax
	}
}
