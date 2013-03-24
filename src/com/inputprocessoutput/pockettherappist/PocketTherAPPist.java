package com.inputprocessoutput.pockettherappist;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent; /*
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;*/
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import java.util.Date;

import com.inputprocessoutput.pockettherappist.UI.Encouragement;

public class PocketTherAPPist extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pocket_ther_appist);

		SeekBar sb1=(SeekBar) findViewById(R.id.suds_slider);
		sb1.setMax(100);
		sb1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				TextView tv1 = (TextView) findViewById(R.id.suds_level_display);
				tv1.setText(Integer.toString(progress));

			}
		});

		Button b1=(Button) findViewById(R.id.suds_submit_button);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				//String current_activity = ;
				int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
			/*	Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(PocketTherAPPist.this, Encouragement.class)/*.putExtra("suds", R.id.suds_level_display).putExtra("time", current_time)*/); 

				// TODO Auto-generated method stub

			}





		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pocket_ther_appist, menu);
		return true;
	}

}
