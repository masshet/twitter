package com.masshet.twitskits;

public class TwitterConstants {
	
	public static final String CONSUMER_KEY = "XAcghzpv5AgMKJ45jIlqQpiUb";
	public static final String CONSUMER_SECRET_KEY = "CUpO8Uhh3kkqsSKNqVb5IxB9swjQxdymgrIbhOchAZX7HokaMa";
	
	public static final String REQUEST_URL = "https://api.twitter.com/oauth/request_token";
	public static final String ACCESS_URL = "https://api.twitter.com/oauth/access_token";
	public static final String AUTHORIZE_URL = "https://api.twitter.com/oauth/authorize";
	
	public static final String OAUTH_CALLBACK_SCHEME = "appfortwitter";
	public static final String OAUTH_CALLBACK_HOST = "callback";
	public static final String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME + "://" + OAUTH_CALLBACK_HOST;

}
