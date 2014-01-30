package com.example.androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class NotesFragment extends Fragment {
	ImageButton buttonPhoto ;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_notes, container, false);
		
		buttonPhoto = (ImageButton) rootView.findViewById(R.id.edit_Audio);
	 	buttonPhoto.setOnClickListener(new OnClickListener(){

	 	   @Override
	 	   public void onClick(View arg0) {
	 		  Intent myIntent = new Intent(getActivity(),SoundRecorder.class);
	 	        startActivity(myIntent);

	 	   }});
		
		return rootView;
	}
	
}
