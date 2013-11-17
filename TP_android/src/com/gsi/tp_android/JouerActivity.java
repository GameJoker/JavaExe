package com.gsi.tp_android;

import java.util.List;

import Base.BDDsujet;
import Base.sujet;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class JouerActivity extends Activity implements OnClickListener{
	sujet s;
	private RadioGroup rg;
	RadioButton r1;
	RadioButton r2;
	RadioButton r3;
	RadioButton r4;
	Button next;
	Variables AppVariables ;
	float text;
	CharSequence c;
	BDDsujet bddsujet = new BDDsujet(this);
	int i;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jouer);
		bddsujet.open();
		AppVariables = ((Variables)getApplicationContext());	
		i=AppVariables.getTitre();
		s = bddsujet.getSujetparID(i);		
		rg = (RadioGroup)findViewById(R.id.radioGroup1);
		TextView tw = (TextView)findViewById(R.id.sujet);
		tw.setText(s.getTitre());
		List<String> Jchoix = s.getChoose();
		r1 = (RadioButton)findViewById(R.id.radio0);
		r1.setText(Jchoix.get(0));
		r2 = (RadioButton)findViewById(R.id.radio1);
		r2.setText(Jchoix.get(1));
		r3 = (RadioButton)findViewById(R.id.radio2);
		r3.setText(Jchoix.get(2));
		r4 = (RadioButton)findViewById(R.id.radio3);
		r4.setText(Jchoix.get(3));
		next = (Button)findViewById(R.id.back);
		if(i<3)
		{
			next.setText("next");
		}
		if(i==3)
		{
			next.setText("Fini");
		}
		text = AppVariables.getNote();
		setTitle(Float.toString(text));
		next.setOnClickListener(this);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener(){

			public void onCheckedChanged(RadioGroup group, int CheckId) {
				// TODO Auto-generated method stub
				switch(CheckId)
				{
				case R.id.radio0:
					c=r1.getText();break;
				case R.id.radio1:
					c=r2.getText();break;
				case R.id.radio2:
					c=r3.getText();break;
				case R.id.radio3:
					c=r4.getText();break;
					
				}
			}
			
		});
		bddsujet.close();
		
	}
	public void onClick(View e) {
		// TODO Auto-generated method stub
		if(e == next)
		{
			if(i<3){
				if(s.getRepondre().equals(c.toString()))
				{
					AppVariables.setNote();
				}
				AppVariables.setTitre();
				Intent next = new Intent(this,JouerActivity.class );
				startActivity(next);
				finish();
			}
			if(i==3){
				if(s.getRepondre().equals(c.toString()))
				{
					AppVariables.setNote();
				}
				AppVariables.setTitre();
				Intent fini = new Intent(this,NoteActivity.class );
				startActivity(fini);
				bddsujet.close();
				finish();
			}
		}
	}

}
