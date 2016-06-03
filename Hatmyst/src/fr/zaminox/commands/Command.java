package fr.zaminox.commands;

import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public abstract class Command {
	
	private String help, prefix, command;
	
	public Command(String help, String prefix, String command) {
		this.help = help;
		this.prefix = prefix;
		this.command = command;
	}
	
	public abstract void onCommand(MessageReceivedEvent e) throws Exception;

	public String getHelp() {
		return help;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getCommand() {
		return command;
	}
	
}
