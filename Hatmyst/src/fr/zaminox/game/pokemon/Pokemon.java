package fr.zaminox.game.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.zaminox.game.pokemon.fight.Fight;

public class Pokemon {
	
	private List<PokemonPlayer> players = new ArrayList<>();
	private List<Fight> fights = new ArrayList<>();
	
	public PokemonType getNewType(String name) {
		for(PokemonType type : PokemonType.values()) if(type.toString().substring(0, 1).toLowerCase().equals(name.substring(0, 1).toLowerCase())) return type;
		
		return PokemonType.values()[new Random().nextInt(PokemonType.values().length)];
	}
	
	public PokemonPlayer getPlayerById(String id) {
		for(PokemonPlayer player : players) if(player.getId().equals(id)) return player;
		
		return null;
	}
	
	public List<PokemonPlayer> getPlayers() {
		return players;
	}
	
	public List<Fight> getFights() {
		return fights;
	}
	
}
