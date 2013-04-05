package com.tql.fragsintabsdemo;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.ListFragment;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class TodaysLoads extends ListFragment {

	String apple_versions[] = new String[]{
	        "Mountain Lion",
	        "Lion",
	        "Snow Leopard",
	        "Leopard",
	        "Tiger",
	        "Panther",
	        "Jaguar",
	        "Puma"
	    };
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,apple_versions);
		setListAdapter(arrayAdapter);
	}

}
