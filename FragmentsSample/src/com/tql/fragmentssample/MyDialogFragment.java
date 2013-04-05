package com.tql.fragmentssample;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MyDialogFragment extends DialogFragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View theView = inflater.inflate(R.layout.mydialogfragment, container,false);
		
		View btnYes = theView.findViewById(R.id.btnYes);
		btnYes.setOnClickListener(this);
		btnYes.requestFocus();
		
		View btnNo = theView.findViewById(R.id.btnNo);
		btnNo.setOnClickListener(this);
		
		Dialog theDialog = getDialog();
		theDialog.setTitle("This is the title");
		theDialog.setCanceledOnTouchOutside(false );
	
		return theView;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int viewId = v.getId();
		switch (viewId) {
		case R.id.btnYes:
			
			break;
		case R.id.btnNo:
		default:
			break;
		}
		dismiss();
	}
	
}
