package com.pasvak.asevi.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {

	   @RequestMapping("/")
	    public String index() {
	        return "index";
	    }
	 
	
	   @RequestMapping("/login")
	    public String Login() {
	        return "login";
	    }
}