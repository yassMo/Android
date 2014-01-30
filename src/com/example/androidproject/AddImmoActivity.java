package com.example.androidproject;


import com.example.androidproject.adapter.TabsPagerAdapter;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

@TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
public class AddImmoActivity extends FragmentActivity implements
ActionBar.TabListener {

private ViewPager viewPager;
private TabsPagerAdapter mAdapter;
private ActionBar actionBar;
private Button button;
private TextView textview;

// Tab titles
private String[] tabs = { "Infos", "Notes", "Map" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_immo);
				
		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new TabsPagerAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}
		

		/**
		 * on swiping the viewpager make respective tab selected
		* */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

	@Override
	public void onPageSelected(int position) {
		// on changing the page
		// make respected tab selected
		actionBar.setSelectedNavigationItem(position);
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
		});
		
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_immo, menu);
		return true;
	}
	
	@Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    case R.id.action_Main:
	    	Intent myIntent1 = new Intent(AddImmoActivity.this,MainActivity.class);
	        startActivity(myIntent1);
	      break;
	    case R.id.action_Consultation:
	    	Intent myIntent2 = new Intent(AddImmoActivity.this,ConsultationActivity.class);
	        startActivity(myIntent2);
	      break;
	    case R.id.action_AddRefLocation:
	    	Intent myIntent3 = new Intent(AddImmoActivity.this,AddRefLocationActivity.class);
	        startActivity(myIntent3);
		      break;
	    default:
	      break;
	    }

	    return true;
	  } 

}
