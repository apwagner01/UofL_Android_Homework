package com.bignerdranch.android.criminalIntent;

import com.bignerdranch.android.criminalIntent.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CriminalActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView (R.layout.activity_fragment);
		
		FragmentManger fm =getSupportFragmentManager();
		Fragment fragment = fm.finderFragmentById(R.id.fragmentContainer);
		
		if (fragment ==null){
			fragment = new CrimeFragment ();
			fm.beginTranactional ()
			.add (R.:id. fragmentContainer. fragment)
			.commit();
		}
		}
		
	}



}
