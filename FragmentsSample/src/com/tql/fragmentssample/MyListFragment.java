package com.tql.fragmentssample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;

public class MyListFragment extends ListFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		
		String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
		ArrayAdapter<String> courseTitlesAdapter = new ArrayAdapter<String>(getActivity(), 
				android.R.layout.simple_list_item_1, courseTitles);
		setListAdapter(courseTitlesAdapter);
		
	}
	
	@Override
	//You must override this method if you are not going to add the fragment as an XML tag
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View theView = inflater.inflate(R.layout.mycustomlistlayout, container, false);
		return theView;
		
	}
	
}
