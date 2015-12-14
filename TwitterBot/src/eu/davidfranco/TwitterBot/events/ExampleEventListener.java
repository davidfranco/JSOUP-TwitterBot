package eu.davidfranco.TwitterBot.events;

import eu.davidfranco.TwitterBot.Tweet;

public class ExampleEventListener {
	@EventHandler
	public void onTweet(TweetEvent e){
		Tweet t = e.getTweet();
		System.out.println(t.getPoster() + " -> " + t.getFormatedDate() + "\n" + t.getContent() + "\n");
	}
}
