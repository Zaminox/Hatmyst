package fr.zaminox.game.pokemon.commands;

import fr.zaminox.Utils;
import fr.zaminox.game.pokemon.Pokemon;
import fr.zaminox.game.pokemon.PokemonPlayer;
import fr.zaminox.game.pokemon.PokemonType;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;
import sx.blah.discord.handle.obj.IUser;

public class GetType extends PokemonCommand {

	public GetType(Pokemon pokemon, Utils utils) {
		super(pokemon, utils, "Permet de récupérer le type d'une personne", "gettype");
	}

	@Override
	public void onCommand(MessageReceivedEvent e, String[] args) throws Exception {
		if(args.length == 1) {
			IUser user = utils.getUserByName(args[0]);
			
			if(user != null) {
				PokemonType type;
				
				if(pokemon.getPlayerById(user.getID()) == null) {
					type = pokemon.getNewType(user.getName()); 
					pokemon.getPlayers().add(new PokemonPlayer(user.getID(), type, 400));
				} else type = pokemon.getPlayerById(user.getID()).getType();
				
				e.getMessage().getChannel().sendMessage(user.mention() + " est du type " + type.toString() + " " + type.getEmoji());
			} else e.getMessage().getChannel().sendMessage(e.getMessage().getAuthor().mention() + " Utilisateur introuvable.");
		} else if(args.length > 1) {
			String name = "";
			
			for(int i = 0; i < args.length; i++) name = name + args[i] + " ";
			
			IUser user = utils.getUserByName(name);
			
			if(user != null) {
				PokemonType type;
				
				if(pokemon.getPlayerById(user.getID()) == null) {
					type = pokemon.getNewType(user.getName()); 
					pokemon.getPlayers().add(new PokemonPlayer(user.getID(), type, 400));
				} else type = pokemon.getPlayerById(user.getID()).getType();
				
				e.getMessage().getChannel().sendMessage(user.mention() + " est du type " + type.toString() + " " + type.getEmoji());
			} else e.getMessage().getChannel().sendMessage(e.getMessage().getAuthor().mention() + " Utilisateur introuvable.");
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
