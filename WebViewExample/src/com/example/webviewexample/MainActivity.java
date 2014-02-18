package com.example.webviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		myWebView.loadUrl("http://www.bing.com");
		myWebView.setWebViewClient(new WebViewClient());
		
	}
	
//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//	    // Check if the key event was the Back button and if there's history
//	    if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
//	        myWebView.goBack();
//	        return true;
//	    }
//	    // If it wasn't the Back key or there's no web page history, bubble up to the default
//	    // system behavior (probably exit the activity)
//	    return super.onKeyDown(keyCode, event);
//	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
