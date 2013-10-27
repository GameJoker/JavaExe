package com.gsi.tp_android;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class StatistiquesActivity extends Activity implements OnClickListener{
	Variables AppVariables ;
	Button retour;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_statistiques);
		AppVariables = ((Variables)getApplicationContext());
		int fois;
		fois = AppVariables.getFois();
		int efois;
		efois = AppVariables.getEfois();
		TextView f = (TextView) findViewById(R.id.fois);
		f.setText(Integer.toString(fois));
		float notes,Mnotes;
		notes = AppVariables.getMnote();
		Mnotes = notes/(float)fois;
		TextView Mn = (TextView) findViewById(R.id.Mnote);
		Mn.setText(Float.toString(Mnotes));
		float eva,Meva;
		eva = AppVariables.getMeva();
		Meva = eva/(float)efois;
		TextView Me = (TextView) findViewById(R.id.Meva);
		Me.setText(Float.toString(Meva));
		retour = (Button) findViewById(R.id.eretour);
		retour.setOnClickListener(this);
	}

	public void onClick(View e) {
		// TODO Auto-generated method stub
		if(e == retour)
		{
			Intent intent = new Intent(this,MainActivity.class );
			startActivity(intent);
			finish();
		}
		
	}

}
