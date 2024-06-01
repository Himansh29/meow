package com.app.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	public TestController() {
		System.out.println("in ctor of " + getClass());
	}

	// add req handling method to test ModelAndView
	@GetMapping("/test1") // @GetMapping : @RequestMapping(method=GET)
	public ModelAndView testModelAndView() {
		System.out.println("in test m nv");
		// o.s.w.s.ModelAndView(String logicalViewName,String modelAttrName,Object
		// value)
		return new ModelAndView("/test/display", "server_ts", LocalDateTime.now());
		// Handler rets MnV ---> D.S --> sends LVN --> V.R --> AVN :
		// /WEB-INF/views/test/display.jsp
		// D.S chks --for model attrs --> present --> adds MOdel attr/s under req scope
		// -->FORWARDS the clnt to the view layer --JSP : use EL syntax for accessing
		// the results.
	}

	// add a req handling method to test Model map
	@GetMapping("/test2")
	public String testModelMap(Model modelMap) {
		System.out.println("in test model map " + modelMap);
		// {} => empty model map (map of model attrs)
		//populate the map with 2 attrs
		modelMap.addAttribute("server_ts", new Date()).
		addAttribute("num_list", List.of(10,20,30,40));
		return "/test/display";//Handler rets explicitly LVN , implicitly rets model map --> D.S
		//D.S ---> LVN --> V.R --> AVN --> D.S --chks for model attrs 
		//yes present --> adds model attrs under req scope --> forwards the clnt --> view layer.
	}

}
