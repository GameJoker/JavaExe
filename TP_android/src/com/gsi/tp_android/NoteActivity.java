package com.gsi.tp_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class NoteActivity extends Activity implements OnClickListener{
	Button retour;
	Variables AppVariables ;
	float note;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_note);
		AppVariables = ((Variables)getApplicationContext());
		note = AppVariables.getNote();
		TextView tw = (TextView)findViewById(R.id.notes);
		tw.setText("Votre note est :" + note);
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


}
