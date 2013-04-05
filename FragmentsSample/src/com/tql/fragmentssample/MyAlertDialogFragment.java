package com.tql.fragmentssample;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyAlertDialogFragment extends DialogFragment implements DialogInterface.OnClickListener{

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage("Do you wanna give it a try?");
		builder.setPositiveButton("Sure why not", this);
		builder.setNegativeButton("No Way", this);
		Dialog theDialog = builder.create();
		theDialog.setCanceledOnTouchOutside(false);
		return theDialog;
	}
	
	
	@Override
	public void onClick(DialogInterface arg0, int arg1) {
		switch (arg1) {
		case Dialog.BUTTON_POSITIVE:
			break;
		case Dialog.BUTTON_NEGATIVE:
			break;
		default:
			break;
		}
		
	}

	
	
}
