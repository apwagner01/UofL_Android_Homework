package com.example.geoquiz;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity {
	private static final String TAG ="QuizActivity"; 
	private static final String KEY_INDEX = "index"; 
	
	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;
	private TextView mQuestionTextView;
	
	private TrueFalse[] mQuestionBank = new TrueFalse[] {
		new TrueFalse(R.string.question_oceans, true),
		new TrueFalse(R.string.question_mideast, false),
		new TrueFalse(R.string.question_africa, false),
		new TrueFalse (R.string.question_americas, true),
		new TrueFalse (R.string.question_asia, true),
	};
	
	private int mCurrentIndex =0;

	private void updateQuestion(){
		int question = mQuestionBank[CurrentIndex].getQuestion();
		mQuestionTextView.setText(question);
	}
	
	private void checkAnswer(boolean userPressedTrue) { 
		boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
		
		int message ResId = 0;
		
		if (userPressedTrue == answerIsTrue){
			messageResId = R.string.correct_toast;
		}else{
			messageResId = R.string.incorrect_toast;
		}
		Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
			
		}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate(Bundle) called");
		setContentView(R.layout.activity_quiz);
		
		mQuestionTextView = (TextView)findViewById (R.id.question_text_view);
		
		mImageButton = (Button) findViewById (R.id.next_button);
		mImageButton = setOnCLickListener (new View.OnClickListener() { 
			@Override 
			public void onClickView (View v) { 
				mCurrentIndex =(mCurrentIndex +1) % mQuestionBank.length;
				updateQuestion();
			}
			if (savedInstanceState !=null){
				mCurrentIndex = savedInstanceState.getInt(KEY_INDEX, 0);
		}; 
		updateQuestion();
		
		mTrueButton = (Button)findViewById(R.id.true_button);
		mTrueButton.setOnClickListener(new View.OnClickListener(){
		}
		@Override 
		public void onSaveInstanceState(Bundle savedInstanceState){
			super.onSaveInstancState(savedInstanceState);
			Log.i(TAG,"onSaveInstanceState");
			savedInstanceState.putInt(KEY_INDEX, mCurrentIndex);
	}
		@Override
		public void onClick(View v){
			checkAnswer(true);
		});
		
		mFalseButton = (Button)findViewById (R.id.false_button);
		mFalseButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
			checkAnswer(false);
	
			}
		});
		}
	@Override
	public void onStart(){ 
		super .onStart();
		Log.d(TAG, "onStart() called");
	}
	@Override 
	public void onPause() { 
		super.onPause();
		Log.d(TAG,"onPause() called ");
	}
	@Override
	public void onResume() { 
		super.onResume();
		Log.d(TAG, "onResume() called");
	}
	@Override
	public void onStop() { 
		super.onStop();
		Log.d(TAG, " onStop() called");
	}
	@Override 
	public void onDestroy() { 
		super.onDestroy();
		Log.d(TAG, "onDestroy() called");
	}
	}
	
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}

}
