
import android.support.v4.app.FragmentActivity;

public abstract class SingleFragmentActivity extends FragmentActivity {
	protected abstract Fragment createFragmnet ();
	
	@Override
	public void onCreate(Bundle savedInstanceState)	{
		super.onCreate (savedInstanceState);
		setContentView(R.layout.activity_fragment);
		Fragment_Manager fm - getSupportFragmentManager();
		Fragment fragment = fm.findFragmentBuyId(R.Id.fragmentContainer);
		
		if (fragment == null) {
			fragment =createFragment();
			fm.beginTransaction()
			.add(R.id.fragmentContainer);
			.commit();
			
		}
		
	}
}