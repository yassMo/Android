package com.example.androidproject.adapter;

import com.example.androidproject.CarteFragment;
import com.example.androidproject.InfosFragment;
import com.example.androidproject.NotesFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new InfosFragment();
		case 1:
			// Games fragment activity
			return new NotesFragment();
		case 2:
			// Movies fragment activity
			return new CarteFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}


}
