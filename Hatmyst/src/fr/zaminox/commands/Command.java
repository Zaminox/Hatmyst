package fr.zaminox.commands;

import fr.zaminox.Utils;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public abstract class Command {
	
	protected Utils utils;
	protected String help, prefix, command;
	
	public Command(Utils utils, String help, String prefix, String command) {
		this.utils = utils;
		this.help = help;
		this.prefix = prefix;
		this.command = command;
	}
	
	public abstract void onCommand(MessageReceivedEvent e, String[] args) throws Exception;

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
