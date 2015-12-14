package eu.davidfranco.TwitterBot.events;

import eu.davidfranco.TwitterBot.Tweet;

public class TweetEvent implements Event{
	private Tweet t;
	public TweetEvent(Tweet t){
		this.t= t;
	}
	public Tweet getTweet(){
		return t;
	}
}
