package com.tql.fragmentssample;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class ActivityTabbed extends Activity implements TabListener {

	private final String _tabDisplayName = "My List Fragment";
	private final String _tabDisplay1Name = "My Dialog Fragment";
	
	Fragment _tab1Fragment;
	Fragment _tab2Fragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activitytablayout);
		
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		createTab(actionBar, _tabDisplayName);
		createTab(actionBar, _tabDisplay1Name);
	}

	private void createTab (ActionBar actionBar, String displayName)
	{
		ActionBar.Tab newTab = actionBar.newTab();
		newTab.setText(displayName);
		newTab.setTabListener(this);
		actionBar.addTab(newTab);
	}
	
	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		CharSequence displayName = tab.getText();
		if (displayName.equals(_tabDisplayName)){
			if (_tab1Fragment == null){
				_tab1Fragment = new  TestFragment();
				ft.add(android.R.id.content,_tab1Fragment);
			}else{
				ft.attach(_tab1Fragment);
			}
		}else if (displayName.equals(_tabDisplay1Name)){
			if (_tab2Fragment == null){
				_tab2Fragment = new TestFragment2();
				ft.add(android.R.id.content, _tab2Fragment);
			}else{
				ft.attach(_tab2Fragment);
			}
		}
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		CharSequence displayName = tab.getText();
		if (displayName.equals(_tabDisplayName)){
			ft.detach(_tab1Fragment);
		}else if (displayName.equals(_tabDisplay1Name)){
			ft.detach(_tab2Fragment);
		}
		
	}

}
