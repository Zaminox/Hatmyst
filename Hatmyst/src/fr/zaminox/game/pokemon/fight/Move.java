package fr.zaminox.game.pokemon.fight;

import fr.zaminox.game.pokemon.PokemonType;

public class Move {
	
	private String name;
	private int damage;
	private PokemonType type;
	
	public Move(String name, int damage, PokemonType type) {
		this.name = name;
		this.damage = damage;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public PokemonType getType() {
		return type;
	}
	
}
