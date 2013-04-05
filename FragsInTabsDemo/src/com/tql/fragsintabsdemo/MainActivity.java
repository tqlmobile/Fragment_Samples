package com.tql.fragsintabsdemo;

import android.net.NetworkInfo.DetailedState;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends FragmentActivity implements TabHost.OnTabChangeListener  {

	TabHost tHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tHost = (TabHost) findViewById(android.R.id.tabhost);
        tHost.setup();
        tHost.setOnTabChangedListener(this);
        
        TabHost.TabSpec tSpecAndroid = tHost.newTabSpec("searchResults");
        //tSpecAndroid.setIndicator("Android",getResources().getDrawable(R.drawable.android));
        tSpecAndroid.setIndicator("Android");
        tSpecAndroid.setContent(new DummyTabContent(getBaseContext()));
        tHost.addTab(tSpecAndroid);
 
        /** Defining tab builder for Apple tab */
        TabHost.TabSpec tSpecApple = tHost.newTabSpec("todaysLoads");
        //tSpecApple.setIndicator("Apple",getResources().getDrawable(R.drawable.apple));
        tSpecApple.setIndicator("Apple");
        tSpecApple.setContent(new DummyTabContent(getBaseContext()));
        tHost.addTab(tSpecApple);
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}



	@Override
	public void onTabChanged(String tabId) {
		
		FragmentManager fm =   getSupportFragmentManager();
        SearchResultsFragment searchResultsFragment = (SearchResultsFragment)fm.findFragmentByTag("searchResults");
        TodaysLoads todaysLoads = (TodaysLoads)fm.findFragmentByTag("todaysLoads");
        FragmentTransaction ft = fm.beginTransaction();
        
        if (searchResultsFragment != null){
        	ft.detach(searchResultsFragment);
        }
        
        if (todaysLoads != null){
        	ft.detach(todaysLoads);
        }
        
        if(tabId.equalsIgnoreCase("searchResults")){
        	 
            if(searchResultsFragment==null){             
                ft.add(R.id.realtabcontent,new SearchResultsFragment(), "searchResults");
            }else{                
                ft.attach(searchResultsFragment);
            }

        }else{    /** If current tab is apple */
            if(todaysLoads==null){           
                ft.add(R.id.realtabcontent,new TodaysLoads(), "todaysLoads");
             }else{
                ft.attach(todaysLoads);
            }
        }
        ft.commit();
		
	}

}
