package com.bignerdranch.android.criminalIntent;

public class Crime {
	private UUID mId
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
	public Crime (){ 
		//Generate unique identifier 
		mId =UUOD.randomUUID();
		mDate = new Date (); 
		private boolean mSovled; 
	}	
	public UUID getId(){
		return mId;
	}
	public String getTitle(){
		return mTitle;
	} 
	public void setTitle(String title){
		mTitle = title;
	}
	public Date getDate () {
		return mDate;
	}
	public void setDate (Date date) {
		mDate = date;
	}
	public boolean isSolved() { 
		return mSolved; 
	}
	public void setSolved(boolean solved){
		mSolved =solved; 
	} 
	
	}
}
