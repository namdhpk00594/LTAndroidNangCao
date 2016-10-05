package lab7.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class ketqua extends Activity{
	Button btnBack;
	TextView txtNhan;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7_ketqua);
		txtNhan = (TextView) findViewById(R.id.txtNhan);
		String gt = getIntent().getExtras().getString("requestCode");
		txtNhan.setText(gt);
	}
}
