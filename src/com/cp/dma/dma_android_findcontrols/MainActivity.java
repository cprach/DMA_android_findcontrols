package com.cp.dma.dma_android_findcontrols;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btnMyButton = (Button)findViewById(R.id.btnMyButton);
		btnMyButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				Intent intent = new Intent(v.getContext(),NextActivity.class);
				Intent intent = new Intent(v.getContext(),NextActivity.class);

				startActivity(intent);
			}

		});

	}

	public void changeText(View view) {
		TextView txtMyTextView = (TextView)findViewById(R.id.txtMyTextView);
		txtMyTextView.setText("The text has changed!");

		Button btnMyButton = (Button)view;
		btnMyButton.setText("The button was clicked!");
	}

//	public void goToNextActivity(View view) {
//		Intent intent = new Intent(this,NextActivity.class);
//		startActivity(intent);
//	}



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
