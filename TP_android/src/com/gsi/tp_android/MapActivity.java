package com.gsi.tp_android;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MapActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		GoogleMap map =((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
		LatLng esigelec = new LatLng(49.383430,1.0773341);
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(esigelec, 15));
		map.addMarker(new MarkerOptions().title("ESIGELCE").snippet("Ecole d'ing¨¦nieur g¨¦n¨¦raliste").position(esigelec));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.map, menu);
		return true;
	}

}
