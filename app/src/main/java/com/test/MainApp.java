package com.test;

import com.parse.Parse;
import com.parse.ParseInstallation;

import android.app.Application;

public class MainApp extends Application {
	
    private static final String parse_app_id = "Kkjn2tL8Hx1ccd44F2y5v8OeDBQ9ng5trtNOcER0";
    private static final String parse_client_key = "OYWJe0EFnRTVbhjxUpEyoHjdwlCGBBVk4dpAOAFu";

	@Override
	public void onCreate() {
		super.onCreate();
		
		Parse.initialize(this, parse_app_id, parse_client_key);
		ParseInstallation.getCurrentInstallation().saveInBackground();
	}
}
