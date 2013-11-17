package com.gsi.tp_android;

import Net.RequeteHttp;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ProposActivity extends Activity implements OnClickListener{
	Button retour;
	TextView tw;
	Button site;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_propos);	
		site = (Button)findViewById(R.id.buttonSite);
		retour = (Button)findViewById(R.id.pretour);
		site.setOnClickListener(this);
		retour.setOnClickListener(this);
	}
	public void onClick(View e) {
		// TODO Auto-generated method stub
		switch(e.getId())
		{
		case R.id.pretour:
			Intent intent = new Intent(this,MainActivity.class );
			startActivity(intent);
			finish();
		case R.id.buttonSite:
			tw = (TextView)findViewById(R.id.textSite);
			new RequeteHttp().execute(tw);
		}
	}

}
