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
		
		String imgPizza = "https://pixabay.com/get/g5c0f9d6fdff69f0b80030019d2819e23f2d83b019525203bb065841928b05701d2c41c6e3901cbf50b371215c89f3c028380cc061a96cf117c2f80c0b28d17483d68c94addd276fea798e015f2b484db_640.jpg";
		
			
		Pizza p1 = new Pizza("margherita", "La regina delle pizze", imgPizza, 5.50f);
		Pizza p2 = new Pizza("diavola", "La piccantissima", imgPizza, 6.50f);
		Pizza p3 = new Pizza("ananas", "L'insulto", imgPizza, 0.50f);
			
		pizzaService.save(p1);
		pizzaService.save(p2);
		pizzaService.save(p3);
			
		System.out.println("Salvataggio dell'elemento andato a buon fine");
			
	}

}
