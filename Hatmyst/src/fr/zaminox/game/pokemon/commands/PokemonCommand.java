package fr.zaminox.game.pokemon.commands;

import fr.zaminox.commands.Command;
import fr.zaminox.game.pokemon.Pokemon;

public abstract class PokemonCommand extends Command {
	
	protected Pokemon pokemon;
	
	public PokemonCommand(Pokemon pokemon, String help, String command) {
		super(help, ">", command);
		this.pokemon = pokemon;
	}
	
}
