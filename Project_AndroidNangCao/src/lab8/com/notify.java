package lab8.com;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class notify extends Activity {
	TextView txtThongBao;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8_notify);
		txtThongBao = (TextView) findViewById(R.id.txtThongBao);
		
		int requestCode = getIntent().getExtras().getInt("requestCode");
		
		DongNotification(requestCode);
		
		txtThongBao.setText("Đã đóng thông báo số: "+requestCode+"\n Có thể dùng id này để hiển thị chi tiết tin nào đấy");
	}
	private void DongNotification(int requestCode) {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.cancel(requestCode);
	}
}
