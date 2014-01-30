package com.example.androidproject;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void LaunchAddImmoActivity(View view)
    {
        Intent myIntent = new Intent(MainActivity.this,AddImmoActivity.class);
        startActivity(myIntent);
    }
	
	public void LaunchConsultationActivity(View view)
    {
        Intent myIntent = new Intent(MainActivity.this,ConsultationActivity.class);
        startActivity(myIntent);
    }

	public void LaunchAddRefLocationActivity(View view)
    {
        Intent myIntent = new Intent(MainActivity.this,AddRefLocationActivity.class);
        startActivity(myIntent);
    }


}
