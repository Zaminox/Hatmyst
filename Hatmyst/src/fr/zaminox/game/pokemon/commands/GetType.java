package fr.zaminox.game.pokemon.commands;

import fr.zaminox.game.pokemon.Pokemon;
import fr.zaminox.game.pokemon.PokemonType;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class GetType extends PokemonCommand {

	public GetType(Pokemon pokemon) {
		super(pokemon, "Permet de récupérer le type d'une personne", "gettype");
	}

	@Override
	public void onCommand(MessageReceivedEvent e) throws Exception {
		PokemonType type = pokemon.getType(e.getMessage().getAuthor().getName());
		
		e.getMessage().getChannel().sendMessage(e.getMessage().getAuthor().mention() + " est du type " + type.toString() + " " + type.getEmoji());
	}
	
}
