package com.world.emotions.resources;

public class Tweets {
	
	long tweet_Id;
	String tweet_Text;
	String  url;
	
	public long getTweet_Id() {
		return tweet_Id;
	}
	public void setTweet_Id(long tweet_Id) {
		this.tweet_Id = tweet_Id;
	}
	public String getTweet_Text() {
		return tweet_Text;
	}
	public void setTweet_Text(String tweet_Text) {
		this.tweet_Text = tweet_Text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	String user;

}
