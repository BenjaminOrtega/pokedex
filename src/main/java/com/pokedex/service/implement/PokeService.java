package com.pokedex.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokedex.dto.Message;
import com.pokedex.dto.Response;
import com.pokedex.feing.PokeFeing;
import com.pokedex.service.PokeServiceI;

@Service
public class PokeService implements PokeServiceI{
	
	@Autowired 
	PokeFeing pokeFeing;

	@Override
	public Response GetPokemon(String name) {
		Response p = new Response();
		try {
			p = Response.builder()
					.data(pokeFeing.getPokemonForName(name))
					.message(Message.builder().code(200).message("success").build()).build();
		} catch (Exception e) {
			p = Response.builder()
					.data(null)
					.message(Message.builder().code(500).message("El pokemon '"+name+"' no existe").build()).build();
		}
		return p;
	}

}
