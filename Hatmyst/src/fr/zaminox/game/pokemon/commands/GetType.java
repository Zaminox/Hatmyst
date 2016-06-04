package fr.zaminox.game.pokemon.commands;

import fr.zaminox.Utils;
import fr.zaminox.game.pokemon.Pokemon;
import fr.zaminox.game.pokemon.PokemonPlayer;
import fr.zaminox.game.pokemon.PokemonType;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class GetType extends PokemonCommand {

	public GetType(Pokemon pokemon, Utils utils) {
		super(pokemon, utils, "Permet de récupérer le type d'une personne", "gettype");
	}

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) throws Exception {
		if(args.length >= 1) {
			
		} else {
			PokemonType type;
			
			if(pokemon.getPlayerById(e.getMessage().getAuthor().getID()) == null) {
				type = pokemon.getNewType(e.getMessage().getAuthor().getName()); 
				pokemon.getPlayers().add(new PokemonPlayer(e.getMessage().getAuthor().getID(), type, 400));
			} else type = pokemon.getPlayerById(e.getMessage().getAuthor().getID()).getType();
			
			e.getMessage().getChannel().sendMessage(e.getMessage().getAuthor().mention() + " est du type " + type.toString() + " " + type.getEmoji());
		}
	}
	
}
