package fr.zaminox;

import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class GeneralEvents {
	
	private IDiscordClient client;
	
	public GeneralEvents(IDiscordClient client) {
		this.client = client;
	}
	
	@EventSubscriber
	public void onPMReceived(MessageReceivedEvent e) {
		try {
			if(e.getMessage().getChannel().isPrivate()) e.getMessage().getChannel().sendMessage("Ajoute-moi � ton channel ! https://discordapp.com/oauth2/authorize?client_id=187599810843377665&scope=bot&permissions=0");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
