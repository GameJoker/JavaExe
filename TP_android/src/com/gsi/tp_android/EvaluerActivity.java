package com.gsi.tp_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;

public class EvaluerActivity extends Activity implements OnClickListener{
	Variables AppVariables ;
	RatingBar rate =null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_evaluer);
		AppVariables = ((Variables)getApplicationContext());
		AppVariables.setEfois();
		rate = (RatingBar) findViewById(R.id.evaluvation);
		rate.setRating((float) 5.0);
		Button evaluer = (Button) findViewById(R.id.evaluer);
		evaluer.setOnClickListener(this);
	}
	public void onClick(View e) {
		// TODO Auto-generated method stub
		switch(e.getId())
		{
		case R.id.evaluer:
			float meva = rate.getRating();
			AppVariables.setMeva(meva);
			Intent intent = new Intent(this,MainActivity.class );
			startActivity(intent);
			finish();
			return;			
		}
	}

}
