package com.example.aula15.controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class OlaMundoController {

	@RequestMapping("/")
	public String getOlaMundo() {
		return "Olá Mundo";
	}

}
