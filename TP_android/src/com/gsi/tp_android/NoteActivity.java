package com.gsi.tp_android;

import java.util.List;
import java.util.Locale;

import Base.BDDsujet;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NoteActivity extends Activity implements OnClickListener{
	Button retour;
	Variables AppVariables ;
	float note;
	private LocationManager lm;
	BDDsujet bddsujet = new BDDsujet(this);
	String pay;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_note);
		bddsujet.open();
		lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);//location
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);
		AppVariables = ((Variables)getApplicationContext());
		note = AppVariables.getNote();
		TextView tw = (TextView)findViewById(R.id.notes);
		tw.setText("Votre note est :" + note);
		//TextView p = (TextView)findViewById(R.id.pay);
		//p.setText(pay);
		retour = (Button)findViewById(R.id.back);
		retour.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == retour)
		{
			AppVariables.setMnote(note);
			AppVariables.setFois();
			AppVariables.resetNote();
			AppVariables.resetTitre();
			Intent intent = new Intent(this,MainActivity.class );
			startActivity(intent);
			finish();
		}
	}
	public void setPay(String pay)
	{
		this.pay = pay;
	}
	private final LocationListener locationListener = new LocationListener(){
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
			TextView p = (TextView)findViewById(R.id.pay);
			if(location !=null){
	        double  latitude = location.getLatitude();
	        double longitude= location.getLongitude();
	        p.setText(Double.toString(latitude)+Double.toString(longitude));
	        Geocoder gc = new Geocoder(NoteActivity.this, Locale.getDefault());
	        List<Address> addresses = null; 
	        try{
	        	addresses = gc.getFromLocation(latitude, longitude, 1); 	
	        }catch (Exception e) {}
	        Address a = addresses.get(0);
	        pay = a.getCountryName();
	    	bddsujet.insertPay(pay);
	    	setPay(pay);
			}
			else
				p.setText("inconu");
	//    	p.setText(a.getCountryName()+Double.toString(latitude)+Double.toString(longitude));
	    	bddsujet.close();
	        
		}
	
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}
	
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}
	
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}
	};

	
		


}
