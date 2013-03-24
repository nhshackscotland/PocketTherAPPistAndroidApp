package com.inputprocessoutput.pockettherappist.UI;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.inputprocessoutput.pockettherappist.PocketTherAPPist;
import com.inputprocessoutput.pockettherappist.R;

public class Encouragement extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_encouragement);

		Button eb1=(Button) findViewById(R.id.continue_prompt);
		eb1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Encouragement.this, PocketTherAPPist.class)); 

				// TODO Auto-generated method stub
			}
		});

	}

}

