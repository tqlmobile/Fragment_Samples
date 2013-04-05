package com.tql.fragsintabsdemo;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

public class SearchResultsFragment extends ListFragment {
	
	String android_versions[] = new String[]{
	        "Jelly Bean",
	        "IceCream Sandwich",
	        "HoneyComb",
	        "Ginger Bread",
	        "Froyo"
	    };
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,android_versions);	
		setListAdapter(arrayAdapter);
	}

	

	

}
