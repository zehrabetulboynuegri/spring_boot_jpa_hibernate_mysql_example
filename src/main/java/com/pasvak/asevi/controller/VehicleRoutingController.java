package com.pasvak.asevi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleRoutingController {
	@RequestMapping("/adres-ekle")
	public String AdresEkle() {
		return "adres-ekle";
	}
	
	
}
