import android.R;


public class DatePickerFragment extends DialogFragment	{
	
	@Override
	public Dialog onCreateDialog (Bundle savedInstanceState) { 
		return new AlertDialog.Builder (getActivity()) 
		.setTitle (R.string.date_picker_title)
		.setPositiveButton (android.R.string.ok, null)
		.create(); 

	}

}
