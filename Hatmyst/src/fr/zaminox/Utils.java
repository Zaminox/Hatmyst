package fr.zaminox;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

public class Utils {
	
	private IDiscordClient client;
	
	public Utils(IDiscordClient client) {
		this.client = client;
	}
	
	public IUser getUserByName(String name) {
		for(IGuild guild : client.getGuilds()) for(IUser user : guild.getUsers()) if(user.getName().equalsIgnoreCase(name)) return user;
		
		return null;
	}
	
}
