package lab5.com;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import lab5.com.adapter.DanhbaAdapter;
import lab5.com.model.danhba;
import manhinhdieukhien.com.R;

public class lab5 extends Activity {
	ListView lvdanhba;
	ArrayList<danhba> danhsachDanhBa;
	DanhbaAdapter danhbaadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_relab5);
		lvdanhba = (ListView) findViewById(R.id.listView);
		danhsachDanhBa = new ArrayList<danhba>();
		danhsachDanhBa.add(new danhba(1,"Nguyễn Lê A","01227672944"));
		danhsachDanhBa.add(new danhba(2,"Trần Thị B","01695462348"));
		danhsachDanhBa.add(new danhba(3,"Đặng Đình C","01227672374"));
		danhsachDanhBa.add(new danhba(4,"Bành Dương D","01665162348"));
		danhsachDanhBa.add(new danhba(5,"Nguyễn Thị E","0905348348"));
		danhsachDanhBa.add(new danhba(6,"Võ Hoàng F","0121157157"));
		danhsachDanhBa.add(new danhba(7,"Phạm Trí G","01227672346"));
		danhsachDanhBa.add(new danhba(8,"Nguyễn Hữu H","0166258268"));
		danhsachDanhBa.add(new danhba(9,"Đặng Thị I","0944265245"));
		danhsachDanhBa.add(new danhba(10,"Lò Văn K","0979797979"));
		danhsachDanhBa.add(new danhba(11,"Lương Thị L","01685162348"));
		danhsachDanhBa.add(new danhba(12,"Nguyễn Văn M","01227675344"));
		danhsachDanhBa.add(new danhba(13,"Trần Thành N","01234575698"));
		danhsachDanhBa.add(new danhba(14,"Trương Quốc O","01227572344"));
		danhsachDanhBa.add(new danhba(15,"Trần Thị P","0932234512"));
		danhsachDanhBa.add(new danhba(16,"Ngô Bảo U","01695102348"));
		danhsachDanhBa.add(new danhba(17,"Đỗ Đức I","0167549523"));
		danhsachDanhBa.add(new danhba(18,"Lý Thành Z","01227672844"));
		danhsachDanhBa.add(new danhba(19,"Nguyễn Thị X","0166987654"));
		danhsachDanhBa.add(new danhba(20,"Lô Y","0922451248"));
		
		danhbaadapter = new DanhbaAdapter(lab5.this, R.layout.item_view, danhsachDanhBa);
		lvdanhba.setAdapter((ListAdapter) danhbaadapter);
	}

}
