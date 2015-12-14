package eu.davidfranco.TwitterBot;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Tweet {
	private String content;
	private long date;
	private String user;
	public Tweet(String content, long date, String user){
		this.content = content;
		this.date = date;
		this.user = user;
	}
	public String getContent(){
		return content;
	}
	public long getDate(){
		return date;
	}
	public String getPoster(){
		return user;
	}
	public String getFormatedDate(){
		DateFormat f = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date);
		return(f.format(c.getTime())); 
	}
}
