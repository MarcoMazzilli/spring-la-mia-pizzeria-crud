package org.java.controller;

import java.util.List;

import org.java.db.pojo.Pizza;
import org.java.db.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerMain {
	
	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		
		List<Pizza> arrayPizze = pizzaService.findAll();
		model.addAttribute("arrayPizze", arrayPizze);
		
		return "index";
	}

}
