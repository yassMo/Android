package com.example.androidproject;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class ConsultationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_consultation);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consultation, menu);
		return true;
	}
	
	@Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    case R.id.action_Main:
	    	Intent myIntent1 = new Intent(ConsultationActivity.this,MainActivity.class);
	        startActivity(myIntent1);
	      break;
	    case R.id.action_AddImmo:
	    	Intent myIntent2 = new Intent(ConsultationActivity.this,AddImmoActivity.class);
	        startActivity(myIntent2);
	      break;
	    case R.id.action_AddRefLocation:
	    	Intent myIntent3 = new Intent(ConsultationActivity.this,AddRefLocationActivity.class);
	        startActivity(myIntent3);
		      break;
	    default:
	      break;
	    }

	    return true;
	  } 


}
