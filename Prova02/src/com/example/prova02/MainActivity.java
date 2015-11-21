/**
 * @author Vitor Quintes
 * 
 */

package com.example.prova02;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

@SuppressWarnings("deprecation")
public class MainActivity extends ActionBarActivity {
	
	Button button1, button2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	    button1 = (button1);
		findViewById(R.id.button1);
		
		button2 = (button2);
		findViewById(R.id.button2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent TrocaTela = new
			Intent(MainActivity.this,MainActivity2.class);
			MainActivity.this.startActivity(TrocaTela);
			MainActivity.this.finish();
				
			}
		});
	
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			Intent TrocaTela = new
			Intent(MainActivity.this,MainActivity2.class);
			MainActivity.this.startActivity(TrocaTela);
			MainActivity.this.finish();
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
