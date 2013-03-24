package com.inputprocessoutput.pockettherappist.UI;

//import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/*import android.app.ListActivity;
import android.content.CursorLoader;
import android.content.Loader;
import android.provider.ContactsContract;
import android.view.Gravity;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleCursorAdapter;*/

import com.inputprocessoutput.pockettherappist.PocketTherAPPist;
import com.inputprocessoutput.pockettherappist.R;

public class ActivityList extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_list);

		
		Button ab1=(Button) findViewById(R.id.activity1);
		ab1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String current_activity = ((Button) v).getText().toString();
			/*	int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
				Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(ActivityList.this, PocketTherAPPist.class).putExtra("activity", current_activity)); 

				// TODO Auto-generated method stub

			}
		});
		
		Button ab2=(Button) findViewById(R.id.activity2);
		ab2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String current_activity = ((Button) v).getText().toString();
			/*	int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
				Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(ActivityList.this, PocketTherAPPist.class).putExtra("activity", current_activity)); 

				// TODO Auto-generated method stub

			}
		});
		
		Button ab3=(Button) findViewById(R.id.activity3);
		ab3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String current_activity = ((Button) v).getText().toString();
			/*	int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
				Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(ActivityList.this, PocketTherAPPist.class).putExtra("activity", current_activity)); 

				// TODO Auto-generated method stub

			}
		});
		
		Button ab4=(Button) findViewById(R.id.activity4);
		ab4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String current_activity = ((Button) v).getText().toString();
			/*	int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
				Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(ActivityList.this, PocketTherAPPist.class).putExtra("activity", current_activity)); 

				// TODO Auto-generated method stub

			}
		});
		
		Button ab5=(Button) findViewById(R.id.activity5);
		ab5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String current_activity = ((Button) v).getText().toString();
			/*	int current_suds = R.id.suds_level_display;
				long current_time = new Date().getTime();
				Storage s = new Storage(this);
				s.storeSuds(); */
				startActivity(new Intent(ActivityList.this, PocketTherAPPist.class).putExtra("activity", current_activity)); 

				// TODO Auto-generated method stub

			}
		});
		
		Button ab6=(Button) findViewById(R.id.addNewActivity);
		ab6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(ActivityList.this, AddNewActivity.class)); 

				// TODO Auto-generated method stub

			}
		});
	}
}
		
		
		
        
/*        public class ListViewLoader extends ListActivity
        implements LoaderManager.LoaderCallbacks<Cursor> {

    // This is the Adapter being used to display the list's data
    SimpleCursorAdapter mAdapter;

    // These are the Contacts rows that we will retrieve
    static final String[] PROJECTION = new String[] {ContactsContract.Data._ID,
            ContactsContract.Data.DISPLAY_NAME};

    // This is the select criteria
    static final String SELECTION = "((" + 
            ContactsContract.Data.DISPLAY_NAME + " NOTNULL) AND (" +
            ContactsContract.Data.DISPLAY_NAME + " != '' ))";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a progress bar to display while the list loads
        ProgressBar progressBar = new ProgressBar(this);
        progressBar.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT, Gravity.CENTER));
        progressBar.setIndeterminate(true);
        getListView().setEmptyView(progressBar);

        // Must add the progress bar to the root of the layout
        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
        root.addView(progressBar);

        // For the cursor adapter, specify which columns go into which views
        String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME};
        int[] toViews = {android.R.id.text1}; // The TextView in simple_list_item_1

        // Create an empty adapter we will use to display the loaded data.
        // We pass null for the cursor, then update it in onLoadFinished()
        mAdapter = new SimpleCursorAdapter(this, 
                android.R.layout.simple_list_item_1, null,
                fromColumns, toViews, 0);
        setListAdapter(mAdapter);

        // Prepare the loader.  Either re-connect with an existing one,
        // or start a new one.
        getLoaderManager().initLoader(0, null, this);
    }

    // Called when a new Loader needs to be created
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        // Now create and return a CursorLoader that will take care of
        // creating a Cursor for the data being displayed.
        return new CursorLoader(this, ContactsContract.Data.CONTENT_URI,
                PROJECTION, SELECTION, null, null);
    }

    // Called when a previously created loader has finished loading
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        // Swap the new cursor in.  (The framework will take care of closing the
        // old cursor once we return.)
        mAdapter.swapCursor(data);
    }

    // Called when a previously created loader is reset, making the data unavailable
    public void onLoaderReset(Loader<Cursor> loader) {
        // This is called when the last Cursor provided to onLoadFinished()
        // above is about to be closed.  We need to make sure we are no
        // longer using it.
        mAdapter.swapCursor(null);
    }

    @Override 
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
    }
}*/
     
        
	