package eu.davidfranco.TwitterBot;

import eu.davidfranco.TwitterBot.events.EventManager;
import eu.davidfranco.TwitterBot.events.ExampleEventListener;

public class TwitterBot {
	public static TwitterManager mg = new TwitterManager();
	public static EventManager emg = new EventManager();
	public static void main(String[] args){
		getEventManager().registerEvents(new ExampleEventListener());
		mg.startSearchThread(10000, new String[]{"#earthquake"});
		mg.startSearchThread(10000, new String[]{"#tsunami"});
		mg.startSearchThread(10000, new String[]{"#storm"});
	}
	public static TwitterManager getManager(){
		return mg;
	}
	public static EventManager getEventManager(){
		return emg;
	}
}
