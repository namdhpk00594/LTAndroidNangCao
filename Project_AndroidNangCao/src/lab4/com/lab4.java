package lab4.com;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import manhinhdieukhien.com.R;

	
public class lab4 extends Activity{
	Button btndialog,btnthoat;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab4);
		btndialog = (Button) findViewById(R.id.btndialog);
		btnthoat = (Button) findViewById(R.id.btnthoat);
		
		Sukien();
	}
	
	private void Sukien() {
		btndialog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Login();
				
			}
		});
		
	}

	Dialog dialoglogin;
	public void Login(){
		dialoglogin = new Dialog(this);
		dialoglogin.setContentView(R.layout.activity_lab4_dialog);
		dialoglogin.setTitle("Dialog");
		
		Button thoat = (Button) dialoglogin.findViewById(R.id.btnthoat);
		
		thoat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialoglogin.dismiss();
				
			}
		});
		dialoglogin.show();
	}
}
