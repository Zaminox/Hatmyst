package fr.zaminox.game.pokemon;

import java.util.HashMap;
import java.util.Map;

public class Pokemon {
	
	private Map<Integer, Integer> fights = new HashMap<>();
	
	public PokemonType getType(String name) {
		for(PokemonType type : PokemonType.values()) if(type.toString().substring(0, 1).toLowerCase().equals(name.substring(0, 1).toLowerCase())) return type;
		
		return PokemonType.FEU;
	}
	
}
