package com.masshet.twitskits;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity {
	
	private SharedPreferences prefs;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		prefs = PreferenceManager.getDefaultSharedPreferences(this);
		
		if (!TwitterUtils.isAuthenticated(prefs)) {
			Intent intent = new Intent(this, PrepareRequestTokenActivity.class);
			startActivity(intent);
		}
	}
}
