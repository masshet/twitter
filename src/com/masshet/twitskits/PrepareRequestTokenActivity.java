package com.masshet.twitskits;

import java.util.concurrent.ExecutionException;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.webkit.WebView;
import android.widget.TextView;

public class PrepareRequestTokenActivity extends ActionBarActivity {

	private OAuthConsumer consumer;
	private OAuthProvider provider;
	private String url;
	private WebView webView;
	OAuthRequestTokenTask task;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_authorization);
		try {
			this.consumer = new CommonsHttpOAuthConsumer(TwitterConstants.CONSUMER_KEY, 
					TwitterConstants.CONSUMER_SECRET_KEY);
			this.provider = new CommonsHttpOAuthProvider(TwitterConstants.REQUEST_URL, 
					TwitterConstants.ACCESS_URL, TwitterConstants.AUTHORIZE_URL);
		} catch(Exception e) {
			
		}
		webView = (WebView) findViewById(R.id.authorization);
		task = new OAuthRequestTokenTask(this,consumer,provider);
		task.execute();
	}
	
	public void loadPage(String url) {
		webView.loadUrl(url);
	}
} 
