package com.pasvak.asevi.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pasvak.asevi.model.Needy;
import com.pasvak.asevi.service.NeedyService;

@Controller
public class NeedyController {
	@Autowired
	private NeedyService service;
	@RequestMapping("/needy-info")
public String viewFormPage(Model model) {
	List<Needy> listNeedy=service.listAll();
	model.addAttribute("listNeedy", listNeedy);
	return "needy-info";
}
	@RequestMapping("/needy-creation")
	public String showNewNeedyForm(Model model) {
		Needy needy=new Needy();
		model.addAttribute("needy", needy);
		return "needy-creation";
	}
	@RequestMapping(value="/save", method= RequestMethod.POST)
	public String saveNeedy(@ModelAttribute("needy") Needy needy) {
		service.save(needy);
	return "redirect:/needy-info";
	}
}