package com.delhi.metro.sasha.gui;


import com.delhi.metro.sasha.fare.FindFareFragment;
import com.delhi.metro.sasha.lasttrainFragment.LastTrainFragment;
import com.delhi.metro.sasha.parking.ParkingFragment;
import com.delhi.metro.sasha.route.FindRouteFragment;

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
			return new FindRouteFragment();
		case 1:
			return new FindFareFragment();
		case 2:
			return new LastTrainFragment();
		
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}

}
