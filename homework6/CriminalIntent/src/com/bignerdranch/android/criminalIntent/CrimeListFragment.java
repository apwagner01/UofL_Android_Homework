package com.bignerdranch.android.criminalIntent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;

public class CrimeListFragment extends ListFragment {
	private ArrayList<Crime> mCrimes;

	
	@Override 
	public void onCreate (Bundle savedInstanceState){
		super.onCreate (savedInstanceState;)
		getActivity().setTitle(R.string.crimes_title);
		mCrimes = CrimeLab.get(getActivity()).getCrimes();
	@Override 
	public void onListItemClick(ListView l, View v, int position, long id) {
	Crime c = ((CrimeAdapter) getListAdapter()).getItem(position);
	
	@Override 
	public vid onResume() { 
		super.onResume();
		((CrimeAdapter) getListAdapter()).notifyDataSetChanged(); 

	// Start CrimeActivity
	Intent i = new Intent(getActivity(), CrimeActivity.class);
	i.putExtra (CrimeFragment.EXTRA_CRIME_ID, c.getID());
	startActivity (i);
		}
	private class CrimeAdapter extends ArrayAdapter<Crime>{
		public CrimeAdapter(ArrayList<Crime> crimes) { 
			super (getActivity(), 0,crimes);
		}		
	@Override
	public View getView (int position, View convertView, ViewGroup parent) { 
	// If we weren't given a view, inflate one 
	   if (convertView== null){ 
	   convertView = getActivity().getLayoutInflater()
	   	.inflate(R.layout.list_item_crime, null);
}
	//Configure the view for this Crime
	Crime c =getItem(position); 
	TextView titleTextView = 
	(TextView) convertView.findViewById(R.id.crime_list_item_titleTextView);
	dateTextView.setText(c.getDate().toString());
	CheckBox solvedCheckBox = 
	(CheckBox) convertView.findViewById(R.id.crime_list_item)solvedCheckedBox);
	solvedCheckBox.setChecked (c.isSolved()):

	return convertView;
	}
}
