package org.java.controller;

import java.util.List;

import org.java.db.pojo.Pizza;
import org.java.db.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ControllerMain {
	
	@Autowired
	private PizzaService pizzaService;
	
	@GetMapping("/")
	public String getIndex(Model model) {
		
		List<Pizza> arrayPizze = pizzaService.findAll();
		int countPizze = arrayPizze.size();
		model.addAttribute("arrayPizze", arrayPizze);
		model.addAttribute("countPizze", countPizze);
		
		return "index";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable int id,Model model) {
		
		Pizza pizza = pizzaService.findById(id);
		model.addAttribute("pizza", pizza);
		
		return "pizza/show";
	}

}
