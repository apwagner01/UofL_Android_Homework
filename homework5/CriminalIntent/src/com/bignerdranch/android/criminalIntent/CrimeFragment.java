package com.bignerdranch.android.criminalIntent;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class CrimeFragment extends FragmentManager {
	private Crime mCrime;
	private Edit
	@Override 
	public void onCreate(Bundle savedInstancesState) { 
		super.onCreate(savedInstanceState);
		mCrime = new Crime();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
		View v = inflator.inflate(R.layout.fragment_crime,parent,false);
		 mTitleField = (EditText)V.findViewById (R.id.crime_title);
		 mTitleField.addRextChangedListener(new TextWatcher() { 
			 mCrime.setTitle(c.toString());
		 }
		 public void beforeTextChanged(
				 CharSequence c, int start, int count, int after){ 
			 //This space interntionally left blank
		 }
		 public void afterTextChanged(Editable c){
		 //This one too 
		 } 
	});
		 
		return v;
	}
	}
	@Override
	public void addOnBackStackChangedListener(OnBackStackChangedListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public FragmentTransaction beginTransaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dump(String arg0, FileDescriptor arg1, PrintWriter arg2,
			String[] arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean executePendingTransactions() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fragment findFragmentById(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fragment findFragmentByTag(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BackStackEntry getBackStackEntryAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBackStackEntryCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Fragment getFragment(Bundle arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fragment> getFragments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void popBackStack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void popBackStack(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void popBackStack(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean popBackStackImmediate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean popBackStackImmediate(String arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean popBackStackImmediate(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void putFragment(Bundle arg0, String arg1, Fragment arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeOnBackStackChangedListener(OnBackStackChangedListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public SavedState saveFragmentInstanceState(Fragment arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
