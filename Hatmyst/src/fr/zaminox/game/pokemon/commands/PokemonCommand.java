package fr.zaminox.game.pokemon.commands;

import fr.zaminox.Utils;
import fr.zaminox.commands.Command;
import fr.zaminox.game.pokemon.Pokemon;

public abstract class PokemonCommand extends Command {
	
	protected Pokemon pokemon;
	
	public PokemonCommand(Pokemon pokemon, Utils utils, String help, String command) {
		super(utils, help, ">", command);
		this.pokemon = pokemon;
	}
	
}
