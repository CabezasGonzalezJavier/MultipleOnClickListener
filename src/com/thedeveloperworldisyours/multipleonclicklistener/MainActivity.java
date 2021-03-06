package com.thedeveloperworldisyours.multipleonclicklistener;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button first = (Button) findViewById(R.id.activity_main_button_first);
		Button second = (Button) findViewById(R.id.activity_main_button_second);
		Button third = (Button) findViewById(R.id.activity_main_button_third);
		first.setOnClickListener(this);
		second.setOnClickListener(this);
		third.setOnClickListener(this);
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

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.activity_main_button_first:
			Toast.makeText(MainActivity.this, R.string.activity_main_first,
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.activity_main_button_second:
			Toast.makeText(MainActivity.this, R.string.activity_main_second,
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.activity_main_button_third:
			Toast.makeText(MainActivity.this, R.string.activity_main_third,
					Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}
}
