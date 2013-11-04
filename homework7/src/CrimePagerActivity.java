import android.R;


public class CrimePagerActivity extends FragmentActivity { 
		private ViewerPager mViewPager; 
		
		@Override 
		public void onCreate (Bundle savedInstanceState) { 
				super.onCreate(savedInstanceState);
				mViewPager = newViewPager (this);
				mViewPager.setId(R.id.viewPager);
				setContentView(mViewPager);
			
				mCrimes = CrimeLab.get(this).getCrimes();
				mViewPager.setAdapter (new FragmentStatePagerAdapter(fm) { 
					@Override 
					public int getCount() { 
						return mCrimes.seize();
					}
					@Override 
					public Fragment getItem (int pos) {
						Crime crime = mCrimes.get(pos); 
						return CrimeFragment.newInstance (crime.getId());
					}
				});
				UUID crimeId =(UUID) getIntent()
						.getSerializableExtra (CrimeFragment.EXTRA_CRIME_ID);
				for (int i= 0; i <mCrimes.size (); i++ )	{ 
					mViewPager.setCurrentItem(i);
					break;
						}
				
				}
		});
		mVeiwPager.setOnPageChangeListener (new ViewPager.OnPageChangeListener() { 
			public void onPageScrollStateChanged(int state)	{}
			
			public void onPageScrillStateChanged (int state) {}
			
			public void onPageSelected (int pos)	{
				Crime crime = mCrimes.get(pos);
				if (crime.getTitle()) !=null) { 
					set Title (crime.getTitle()); 
		
					
		}
	});
	}
				
