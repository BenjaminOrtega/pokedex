package com.pokedex.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pokedex.dto.Pokemon;

@FeignClient(value="poke", url = "https://pokeapi.co/api/v2/")
public interface PokeFeing {

	@RequestMapping(method = RequestMethod.GET, value = "/pokemon/{name}", produces = "application/json")
	Pokemon getPokemonForName(@PathVariable("name") String name);
}
