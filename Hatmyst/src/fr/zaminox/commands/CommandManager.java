package fr.zaminox.commands;

import java.util.ArrayList;
import java.util.List;

import fr.zaminox.game.pokemon.Pokemon;
import fr.zaminox.game.pokemon.commands.GetType;
import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class CommandManager {
	
	private List<Command> commands = new ArrayList<>();
	private Pokemon pokemon;
	
	public CommandManager(Pokemon pokemon) {
		this.pokemon = pokemon;
		
		initialize();
	}
	
	private void initialize() {
		commands.add(new GetType(pokemon));
	}
	
	@EventSubscriber
	public void onMessageReceived(MessageReceivedEvent e) {
		String message = e.getMessage().getContent();
		
		try {
			for(Command command : commands) if(message.split(" ")[0].equalsIgnoreCase(command.getPrefix() + command.getCommand())) { command.onCommand(e); break; }
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
