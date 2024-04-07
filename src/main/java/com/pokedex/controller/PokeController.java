package com.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokedex.dto.Response;
import com.pokedex.service.PokeServiceI;

@RestController
@RequestMapping("pokemon/")
public class PokeController {
	
	@Autowired
	PokeServiceI service;
	
	@GetMapping("{name}/")
	public ResponseEntity<Response> getPokemon(@PathVariable String name){
		Response p = service.GetPokemon(name);
		return new ResponseEntity<Response>(p, HttpStatusCode.valueOf(200));
	}

}
