package fr.zaminox.commands;

import java.util.ArrayList;
import java.util.List;

import fr.zaminox.Utils;
import fr.zaminox.game.pokemon.Pokemon;
import fr.zaminox.game.pokemon.commands.GetType;
import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class CommandManager {
	
	private List<Command> commands = new ArrayList<>();
	private Pokemon pokemon;
	private Utils utils;
	
	public CommandManager(Pokemon pokemon, Utils utils) {
		this.pokemon = pokemon;
		this.utils = utils;
		
		initialize();
	}
	
	private void initialize() {
		commands.add(new GetType(pokemon, utils));
	}
	
	@EventSubscriber
	public void onMessageReceived(MessageReceivedEvent e) {
		String message = e.getMessage().getContent();
		
		try {
			for(Command command : commands) {
				if(message.split(" ")[0].equalsIgnoreCase(command.getPrefix() + command.getCommand())) {
					try {
						String commandString = message.substring(command.getPrefix().length() + command.getCommand().length() + 1);
						command.onCommand(e, commandString.split(" "));
					} catch(StringIndexOutOfBoundsException ex) {
						command.onCommand(e, new String[] {});
					}
					
					break;
				}
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
