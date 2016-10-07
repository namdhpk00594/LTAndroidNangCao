package lab8.com;

import java.util.Random;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import manhinhdieukhien.com.R;

public class lab8 extends Activity {
	Button btnTao, btnDong;
	int notiId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8);
		
		btnTao = (Button) findViewById(R.id.btnTao);
		btnDong = (Button) findViewById(R.id.btnDong);
		
		SuKien();
	}
	private void SuKien() {
		btnTao.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TaoNotification();
				
			}	
		});
		btnDong.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DongNotification();
				
			}
		});
		
	}
	protected void DongNotification() {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.cancelAll();
	}
	protected void TaoNotification() {
		notiId = HamTaoMa();
		Notification.Builder noti = new Notification.Builder(this);
		noti.setSmallIcon(R.drawable.firefoxicon);
		noti.setContentTitle("Có Thông Báo mới"+notiId);
		noti.setContentText("Nhấn Để Cập Nhập Version");
		
		Intent intent = new Intent(this,notify.class);
		intent.putExtra("requestCode", notiId);
		PendingIntent pendingintent = PendingIntent.getActivity(this, notiId, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		
		noti.setContentIntent(pendingintent);
		
		Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_RINGTONE);
		noti.setSound(uri);
		
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.notify(notiId,noti.build());
	}
	private int HamTaoMa() {
		Random random = new Random();
		int ma = random.nextInt();
		return ma;
	}

}
