package fr.zaminox.game.pokemon;

import java.util.List;

import fr.zaminox.game.pokemon.fight.Move;

public enum PokemonType {
	
	ACIER(":chains:", null),
	COMBAT(":punch:", null),
	DRAGON(":dragon:", null),
	EAU(":droplet:", null),
	FEU(":fire:", null),
	GLACE(":snowflake:", null),
	INSECTE(":bug:", null),
	NORMAL(":dagger:", null),
	PLANTE(":seedling:", null),
	ROCHE(":new_moon:", null),
	SOL(":mountain:", null),
	TENEBRES(":bust_in_silhouette:", null),
	VOL(":dash:", null);
	
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
