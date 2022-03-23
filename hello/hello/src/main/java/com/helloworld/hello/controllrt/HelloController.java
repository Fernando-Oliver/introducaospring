package com.helloworld.hello.controllrt;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "hello Generation!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Orientação ao futuro; \nResponsabilidade Pessoal; \nMentalidade de Crescimento "
				+ "\nPersistência; \nTrabalho em equipe; \nAtenção aos detalhes; \nProatividade"
				+ "\nComunicação";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "conceitos básicos do Spring";
	}
	
}

