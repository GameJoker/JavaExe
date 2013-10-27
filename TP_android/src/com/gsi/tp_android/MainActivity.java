package com.gsi.tp_android;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		SubMenu m = menu.addSubMenu("Jouer");
		m.add(Menu.NONE, 1, Menu.NONE, "JEE");
		m.add(Menu.NONE, 2, Menu.NONE, "Android");
		menu.add(0, 3, 0, "Evaluer");
		menu.add(0, 4, 0, "Statistiques");
		menu.add(0, 5, 0, "A propos");
		menu.add(0, 6, 0, "Quitter");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case 1:
			Intent jee = new Intent(this,JouerActivity.class );
			startActivity(jee);
			setTitle("JEE");
			finish();
			break;
		case 2:
			Intent and = new Intent(this,AndroidActivity.class );
			startActivity(and);
			setTitle("Android");
			finish();
			break;
		case 3:
			setTitle("Evaluer");
			Intent evaluer = new Intent(this,EvaluerActivity.class );
			startActivity(evaluer);
			finish();
			break;
		case 4:
			setTitle("Statistique");
			Intent Statistique = new Intent(this,StatistiquesActivity.class );
			startActivity(Statistique);
			finish();
			break;
		case 5:
			setTitle("A propos");
			Intent propos = new Intent(this,ProposActivity.class );
			startActivity(propos);
			finish();
			break;
		case 6:
			System.exit(0);
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
