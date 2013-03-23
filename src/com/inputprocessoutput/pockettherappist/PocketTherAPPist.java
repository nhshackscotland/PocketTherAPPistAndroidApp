package com.inputprocessoutput.pockettherappist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PocketTherAPPist extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pocket_ther_appist);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.pocket_ther_appist, menu);
        return true;
    }
    
}
