package fr.zaminox.game.pokemon;

import java.util.List;

import fr.zaminox.game.pokemon.moves.Move;

public enum PokemonType {
	
	ACIER(":chains:", null),
	FEU(":fire:", null),
	INSECTE(":bug:", null),
	DRAGON(":dragon:", null),
	ELECTRIQUE(":zap:", null),
	PLANTE(":four_leaf_clover:", null),
	EAU(":droplet:", null);
	
	private String emoji;
	private List<Move> moves;
	
	private PokemonType(String emoji, List<Move> moves) {
		this.emoji = emoji;
		this.moves = moves;
	}
	
	public String getEmoji() {
		return emoji;
	}
	
	public List<Move> getMoves() {
		return moves;
	}
	
}
