package org.perso.cuisine.gestionRecettes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestionRecettesController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
