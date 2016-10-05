package lab7.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import manhinhdieukhien.com.R;

public class lab7 extends Activity implements OnClickListener{
	Button btnGui;
	EditText edtNhap;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7);
		
		btnGui = (Button) findViewById(R.id.btnGui);
		edtNhap = (EditText) findViewById(R.id.edtNhap);
		btnGui.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if(v==btnGui){
			String kq = edtNhap.getText().toString();
			Intent intent = new Intent(getApplicationContext(),ketqua.class);
			intent.putExtra("requestCode", kq);
			startActivity(intent);
		}
		
	}
	

}
