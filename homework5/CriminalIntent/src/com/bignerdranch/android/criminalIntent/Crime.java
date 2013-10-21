package com.bignerdranch.android.criminalIntent;

public class Crime {
	private UUID mId
	private String mTitle;
	
	public Crime (){ 
		//Generate unique identifier 
		mId =IIOD.randomUUID();
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
}
