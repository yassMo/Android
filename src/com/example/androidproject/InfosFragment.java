package com.example.androidproject;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;

public class InfosFragment extends Fragment {


	EditText txt ;
	ImageButton button ;
	ImageButton buttonPhoto ;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_info, container, false);

		txt = (EditText) rootView.findViewById(R.id.edit_Num);
		
	    button = (ImageButton) rootView.findViewById(R.id.button_Call);
	    // add PhoneStateListener
	 			PhoneCallListener phoneListener = new PhoneCallListener();
	 			TelephonyManager telephonyManager = (TelephonyManager) this.getActivity()
	 				.getSystemService(Context.TELEPHONY_SERVICE);
	 			telephonyManager.listen(phoneListener,PhoneStateListener.LISTEN_CALL_STATE);
	 	 
	 			// add button listener
	 			button.setOnClickListener(new OnClickListener() {
	 	 
	 				@Override
	 				public void onClick(View arg0) {
	 	 
	 					Intent callIntent = new Intent(Intent.ACTION_CALL);
	 					callIntent.setData(Uri.parse("tel:"+txt.getText().toString()));
	 					System.out.println("TEELLLLLLL:"+txt.getText().toString());
	 					startActivity(callIntent);
	 	 
	 				}
	 	 
	 			});
  
	 	buttonPhoto = (ImageButton) rootView.findViewById(R.id.button_Photo);
	 	buttonPhoto.setOnClickListener(new OnClickListener(){

	 	   @Override
	 	   public void onClick(View arg0) {
	 		  Intent myIntent = new Intent(getActivity(),PhotoIntentActivity.class);
	 	        startActivity(myIntent);

	 	   }});
		
		return rootView;
	}
	

	
}
