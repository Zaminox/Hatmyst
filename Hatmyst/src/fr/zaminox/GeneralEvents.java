package fr.zaminox;

import sx.blah.discord.api.EventSubscriber;
import sx.blah.discord.handle.impl.events.MessageReceivedEvent;

public class GeneralEvents {
	
	private Utils utils;
	
	public GeneralEvents(Utils utils) {
		this.utils = utils;
	}
	
	@EventSubscriber
	public void onPMReceived(MessageReceivedEvent e) {
		try {
			if(e.getMessage().getChannel().isPrivate()) e.getMessage().getChannel().sendMessage("Ajoute-moi à ton channel ! https://discordapp.com/oauth2/authorize?client_id=187599810843377665&scope=bot&permissions=0");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
