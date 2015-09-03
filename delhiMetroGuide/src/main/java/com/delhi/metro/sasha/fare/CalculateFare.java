package com.delhi.metro.sasha.fare;

import android.content.Context;

import com.delhi.metro.sasha.db.DbHelper;

public class CalculateFare {
	private Context mContext;
	private float fare = 0;

	public CalculateFare(Context context) {
		mContext = context;
	}

	public float getFare(String source, String destination) {
		DbHelper dbHelper = new DbHelper(mContext);
		fare = dbHelper.getFare(source, destination);
		return fare;
	}

}
