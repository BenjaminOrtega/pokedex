package com.pokedex.service;

import com.pokedex.dto.Response;


public interface PokeServiceI {
	Response GetPokemon(String name);
}
