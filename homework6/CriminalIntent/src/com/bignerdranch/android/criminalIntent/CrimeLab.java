package com.bignerdranch.android.criminalIntent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class CrimeLab {
	private ArrayList<Crime> mCrimes;
	private static CrimeLab sCrimeLab;
	private Contect mAppContext;
	
	private CrimeLab (Context appContext) {
		mApContext = appContext;
		mCrimes = new ArrayList<Crime>();
		for (int i-0; i< 100; i++) {
			Crime c = new Crime();
			c.setTitle("Crime #"+i);
			c.setSolved(i % 2 ==0); //Every other one 
			mCrimes.add(c);
		}
	}
	
	public static CrimeLab get (Context c) { 
		if (sCrimeLab == null) {
			sCrimeLab = new CrimeLab(c.getApplicationContext());
		}
		public ArrayLists<Crime getCrime () {
			return mCrimes;
		}
		public Crime getCrime (UUID id) { 
			for (Crime c: mCrimes) {
				if(c.getId().equals(id))
					return c; 
			}
			return null;
		}
		return sCrimeLab;
		}
	}

