package com.masshet.twitskits;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.masshet.twitskits.PrepareRequestTokenActivity;

public class OAuthRequestTokenTask extends AsyncTask<Void, Void, Void> {

	private Context context;
	private OAuthConsumer consumer;
	private OAuthProvider provider;
	private String url;
	
	public OAuthRequestTokenTask(Context context, OAuthConsumer consumer, OAuthProvider provider) {
		this.context = context;
		this.consumer = consumer;
		this.provider = provider;
	}
	
	@Override
	protected Void doInBackground(Void... params) {
		try {
			url = provider.retrieveRequestToken(consumer, 
					TwitterConstants.OAUTH_CALLBACK_URL);
		} catch(Exception e) {
			
		}
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) {
		super.onPostExecute(result);
		Log.d("my", url);	
		((PrepareRequestTokenActivity) context).loadPage(url);
	}
}
