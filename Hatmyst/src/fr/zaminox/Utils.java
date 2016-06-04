package fr.zaminox;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IUser;

public class Utils {
	
	private IDiscordClient client;
	
	public Utils(IDiscordClient client) {
		this.client = client;
	}
	
	public IUser getUserByName(String name) {
		for(IChannel channel : client.getChannels(false)) for(IUser user : channel.getUsersHere()) if(user.getName().equalsIgnoreCase(name)) return user;
		
		return null;
	}
	
}
