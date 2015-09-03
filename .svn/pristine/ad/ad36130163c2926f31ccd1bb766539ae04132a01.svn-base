package com.delhi.metro.sasha.googleapis;

import com.delhi.metro.sasha.R;
import com.delhi.metro.sasha.route.StopListUiFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

public class FollowRouteActivity extends FragmentActivity {
	private String src, dest,place;
    private TextView guideText,header;
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.place_follow_route);
		guideText = (TextView)findViewById(R.id.guide);
		header = (TextView)findViewById(R.id.header);
		Intent i = getIntent();
		src = i.getStringExtra("source");
		dest = i.getStringExtra("destination");
		place = i.getStringExtra("place");

		if(src!=null && dest !=null && place !=null) {
		        guideText.setText(String.format(getResources().getString(R.string.place_guide_text),place,src,dest));
			    initFragment();
		}
 		else{
			header.setVisibility(View.GONE);
			guideText.setText("Sorry Unable to find any route :(. Please try again");

		}

	}

	private void initFragment() {
		StopListUiFragment fragment = new StopListUiFragment();
		Bundle args = new Bundle();
		args.putString("source", src);
		args.putString("destination", dest);
		fragment.setArguments(args);
		FragmentTransaction transaction = this.getSupportFragmentManager().beginTransaction();
		transaction.replace(R.id.container, fragment, "stoplistfragment");
		transaction.commit();

	}
}
