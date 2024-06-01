package com.app.controller;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // mandatory cls level anno to specify -- it's request handling controller :
			// spring bean
//singleton n eager
public class HelloController {
	public HelloController() {
		System.out.println("in ctor of " + getClass());
	}

	@PostConstruct
	public void anyInit() {
		System.out.println("in init of "+getClass());
	}
	//add req handling method : to display welcome mesg
	@RequestMapping("/hello") //mandatory anno to add a mapping between
	//incoming req n handler's method
	//entry in Handler mapping bean 
	//key :/hello
	//value : com.app.controller.HelloController.sayHello
	public String sayHello()
	{
		System.out.println("in say hello");
		return "/welcome";//Handler rets LVN --> D.S --> V.R --> AVN --> /WEB-INF/views/welcome.jsp
	}
	
}
