package fr.zaminox.game.pokemon;

public class PokemonPlayer {
	
	private String id;
	private PokemonType type;
	private int hp;
	
	public PokemonPlayer(String id, PokemonType type, int hp) {
		this.id = id;
		this.type = type;
		this.hp = hp;
	}
	
	public String getId() {
		return id;
	}
	
	public PokemonType getType() {
		return type;
	}
	
	public int getHp() {
		return hp;
	}
	
}
