package com.gsi.tp_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ProposActivity extends Activity implements OnClickListener{
	Button retour;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_propos);
		retour = (Button)findViewById(R.id.pretour);
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
		}
	}

}
