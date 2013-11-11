package com.begnerdranch.android.hellomoon;

public class AudioPlayer {

	public void setup () { 
		if(mPlayer !=null) { 
			mPlayer.released();
			mPlayer = null; 
		}
	}
	public void play (Context c) { 
		stop();
		
		mPlayer = MediaPlayer.create(c, R.raw.one_small_step); 
		
		mPlayer.setOnCompletionListener (new MediaPlayer.OnCompletionListener() { 
			public void onCompletion(MediaPlayer mp) { 
				stop();  
			}
		}); 
		mPlayer.start();
	}
}
