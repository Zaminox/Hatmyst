package fr.zaminox;

import java.util.Scanner;

import fr.zaminox.commands.CommandManager;
import fr.zaminox.game.pokemon.Pokemon;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;

public class Hatmyst extends Thread implements Runnable {
	
	private IDiscordClient client;
	
	private Pokemon pokemon;
	private Utils utils;
	
	public Hatmyst() throws Exception {
		initialize();
	}
	
	private void initialize() throws Exception {
		client = new ClientBuilder().withToken("MTg3NjAyMjAzNzQwMDc4MDgw.CjCxhQ.WmBnGVnqTSH_QVCLSd57lu0XdPA").login(); 
		pokemon = new Pokemon();
		utils = new Utils(client);
		
		client.getDispatcher().registerListener(new GeneralEvents(utils));
		client.getDispatcher().registerListener(new CommandManager(pokemon, utils));
		
		start();
	}
	
	@SuppressWarnings("resource")
	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Connecté.");
			
			while(true) {
				String message = scanner.nextLine();
				
				for(IChannel channel : client.getChannels(true)) if(channel.getName().equals("hatmyst")) channel.sendMessage(message);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			new Hatmyst();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
