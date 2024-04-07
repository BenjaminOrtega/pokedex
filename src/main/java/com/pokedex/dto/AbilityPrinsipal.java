package com.pokedex.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AbilityPrinsipal {
	private Ability ability;
	@JsonProperty("is_hidden")
	private Boolean isHidden;
	private Integer slot;
}
