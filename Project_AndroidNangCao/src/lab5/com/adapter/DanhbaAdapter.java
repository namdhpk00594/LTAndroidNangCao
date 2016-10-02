package lab5.com.adapter;

import java.util.List;
import java.util.zip.Inflater;

import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import lab5.com.model.danhba;
import manhinhdieukhien.com.R;

public class DanhbaAdapter extends ArrayAdapter<danhba>{
	Activity context;
	int resource;
	List<danhba> objects;
		
	public DanhbaAdapter(Activity context, int resource,List<danhba> objects) {
		super(context, resource, objects);
		this.context=context;
		this.resource=resource;
		this.objects=objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = this.context.getLayoutInflater();
		View row = inflater.inflate(this.resource, null);
		
		TextView txtTen = (TextView) row.findViewById(R.id.txtTen);
		TextView txtSdt = (TextView) row.findViewById(R.id.txtSdt);
		ImageButton btnPhone = (ImageButton) row.findViewById(R.id.btnPhone);
		ImageButton btnMail = (ImageButton) row.findViewById(R.id.btnMail);
		ImageButton btnSetting = (ImageButton) row.findViewById(R.id.btnSetting);
		
		danhba danhba=this.objects.get(position);
		txtTen.setText(danhba.getTen());
		txtSdt.setText(danhba.getPhone());
		return row;
		
	}

}
