package com.tql.fragmentssample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		// TODO Auto-generated method stub
		return super.onCreateView(name, context, attrs);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case R.id.listFragMenuItem:
			Intent listIntent = new Intent(this, MyListActivity.class);
			startActivity(listIntent);
			break;
		case R.id.dialogFragMenuItem:
			FragmentManager fm = getSupportFragmentManager();
			MyAlertDialogFragment alertFrag = new MyAlertDialogFragment();
			alertFrag.show(fm, "DialogFrag");
			break;
		case R.id.actionTab:
			Intent intent = new Intent(this, ActivityTabbed.class);
			startActivity(intent);
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}

}
