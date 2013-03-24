package com.inputprocessoutput.pockettherappist.UI;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

import com.inputprocessoutput.pockettherappist.R;

public class AddNewActivity extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_activity);
        

        SeekBar sb2=(SeekBar) findViewById(R.id.startingSudsSlider);
        sb2.setMax(100);
        sb2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

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
            	TextView tv2 = (TextView) findViewById(R.id.starting_suds_display);
            	tv2.setText(Integer.toString(progress));

            }
        });
     
        
	}
}