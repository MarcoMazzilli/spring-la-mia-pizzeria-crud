package org.java;

import org.java.db.pojo.Pizza;
import org.java.db.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaMiaPizzeriaCrudApplication implements CommandLineRunner {
	
	@Autowired
	private PizzaService pizzaService;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringLaMiaPizzeriaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		String imgPizza = "https://images.pexels.com/photos/10790638/pexels-photo-10790638.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";
		
			
		Pizza p1 = new Pizza("margherita", "La regina delle pizze", imgPizza, 5.50f);
		Pizza p2 = new Pizza("diavola", "La piccantissima", imgPizza, 6.50f);
		Pizza p3 = new Pizza("ananas", "L'insulto", imgPizza, 0.50f);
			
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
			
		System.out.println("Salvataggio dell'elemento andato a buon fine");
			
	}

}
