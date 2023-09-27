package com.codingdojo.luis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class RetoenequiposApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoenequiposApplication.class, args);
	}
	@GetMapping("/")
	public String Home() {
		return "<h1>¿Quien ira a viajar y a donde??:o</h1>";
	}
	
	
	@GetMapping("/vacaciones/{lugar}/{cantidad}/{nombre}")
	public String Vacaciones(@PathVariable("lugar")String lugar,
			    			 @PathVariable("cantidad")int cantidad,
			    			 @PathVariable("nombre")String nombre) {
		return "<h1>"+nombre+" Viajara por el mundo y conocera "+lugar+" el "+cantidad+" de este mes.</h1>";
		
	}

}
