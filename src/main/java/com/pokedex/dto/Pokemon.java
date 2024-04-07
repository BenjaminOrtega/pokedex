package com.pokedex.dto;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pokemon implements Serializable{

	private static final long serialVersionUID = -2807826651897392409L;
	@JsonProperty("base_experience")
	private Integer baseExperience;
	private Integer id;
	private String name;
	private Integer order;
	private List<AbilityPrinsipal> abilities;

}
