import android.R;
import android.view.View;


public class DatePickerFragment extends DialogFragment	{
	public static final String EXTRA DATE = 
			"com.bignerdranch.android.criminalintent.date";
	private Date mDate; 
	

		private Date mDate; 
		
		public static DatePickerFragment new Instance (Date date) { 
			Bundle args = new Bundle(); 
			args.putSerializable (EXTRA_DATE, date); 
			
			DatePickerFragment fragment = new DatePickerFragment (); 
			fragment.setArguments (args); 
			
			return fragment; 
		} 
		}
	}
	
	private void sendResult (int resultCode) { 
		if (get TargetFragment( == null)
		return; 
		
		Intent i = new Intent (); 
		 i.putExtra (EXTRA_DATE, mDate);
		 
		 getTargetFragment()
		 	.onActivityResult (getTargetRequestCode(), resultCode, i);
	} 
	
	@Override
	public Dialog onCreateDialog (Bundle savedInstanceState) { 
		mDate = (Date) getArguments().getSerializable(EXTRA_DATE);
		
		//Create a Calendar to get the year, month and day
		Calendar calendar = Calendar.getInstance (); 
		calendar,setTime (mDate); 
		int year = calendar.get(Calendar.YEAR); 
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH); 
		
		View v = getActivity().getLayoutInflator()
			.inflate (R.layout.dialog_date, null); 
		
		DatePicker datePicker = (DatePicker)v.findViewById(R.id.dialog_date_datePicker);
		datepicker,init(year, month, day, new OnDateCgangedListener()) { 
			public void onDateChanged (DatePciker view, int yea, int month, int day) { 
				//Translate year, month, day into a Date object using a calendar
				mDate = new GregorianCalendar (year, month, day).getTime(); 
				
				//Update argument to preserve selected value on rotation 
				getArguments().putSerializable (EXTRA_DATE, mDate);
			}
		});
		
			}
		return new AlertDialog.Builder (getActivity()) 
		.setView(v)
		.setTitle (R.string.date_picker_title)
		. setPositiveButton( 
				android.R.string.ok,
				new DialogInterdface.OnCLickListener(){ 
					public void onClick (DialogInterface dialog, int which) { 
						sendResult (Activity.Result_OK); 
					}
				});
		
		.create(); 

	}

}
