package com.inputprocessoutput.pockettherappist;


/*import java.util.ArrayList;
import java.util.List;*/

import com.inputprocessoutput.pockettherappist.Storage;
import com.inputprocessoutput.pockettherappist.Model.Activity;
import com.inputprocessoutput.pockettherappist.Model.Suds;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
*
* @author Michael Richardson (Twitter: @Biz_Chest)
* @copyright Michael Richardson 2013
* @license Open Source under the New BSD License
* @url https://github.com/nhshackscotland/PocketTherAPPistAndroidApp
*/
public class Storage extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "suds.db";

    public Storage(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE activity ( "+
        		BaseColumns._ID + " INTEGER PRIMARY KEY NOT NULL, " +
        	    " activity_name STRING NOT NULL, " +
        	    " starting_suds INTEGER NOT NULL, "+
        	    " activity_created LONG NOT NULL "+
        		");"); 
        db.execSQL("CREATE TABLE suds ( "+
        		BaseColumns._ID + " INTEGER PRIMARY KEY NOT NULL, " +
        		" activity STRING NULL, "+
        		" suds INTEGER NULL, "+
        		" time LONG NULL, "+
        		");");
    }

    public void storeSuds(Suds suds) {
    	SQLiteDatabase db = this.getWritableDatabase();
    	// String[] whereArgs = { Integer.toString(suds.getId()) };
    	ContentValues cv = new ContentValues();
    	cv.put("activity", suds.getActivity());
    	cv.put("suds", suds.getSuds());
    	cv.put("time", suds.getTime());
    	cv.put(BaseColumns._ID,suds.getId());
    	db.insert("suds", null, cv);	
    	db.close();
    }

    public void storeActivity(Activity activity) {
    	SQLiteDatabase db = this.getWritableDatabase();
    	// String[] whereArgs = { Integer.toString(activity.getId()) };
    	ContentValues cv = new ContentValues();
    	cv.put("activity_name", activity.getActivityName());
    	cv.put("starting_suds", activity.getStartingSuds());
    	cv.put("activity_created", activity.getActivityCreated());
    	cv.put(BaseColumns._ID,activity.getId());
    	db.insert("activity", null, cv);
        db.close();
	}	

/*    public List<Activity> getActivities() {
    	List<Feature> features = new ArrayList<Feature>();
        SQLiteDatabase db = getReadableDatabase();
        String[] d = { };
        Cursor c = db.rawQuery("SELECT "+BaseColumns._ID+", lat, lng, collectionID, title, answeredAllQuestions FROM feature ", d);
        for(int i = 0; i < c.getCount(); i++) {
                c.moveToPosition(i);
                features.add(new Feature(c.getInt(0),c.getFloat(1),c.getFloat(2),c.getInt(3),c.getString(4),c.getInt(5)));
        }
        db.close();
        return features;
    }*/

    public Activity getActivity(int id) {
    	Activity f = null;
    	SQLiteDatabase db = getReadableDatabase();
    	String[] d = { Integer.toString(id) };
    	Cursor c = db.rawQuery("SELECT "+BaseColumns._ID+", activity_name, starting_suds, activity_created FROM activity WHERE "+BaseColumns._ID+"=?", d);
    	if (c.getCount() > 0){
    		c.moveToPosition(0);
    		f = new Activity(c.getInt(0),c.getString(1),c.getInt(2),c.getLong(3));
    	}
    	db.close();
    	return f;
    }

/*public List<Suds> getSuds() {
    List<Suds> features = new ArrayList<Suds>();
    SQLiteDatabase db = getReadableDatabase();
    String[] d = { };
    Cursor c = db.rawQuery("SELECT "+BaseColumns._ID+", lat, lng, collectionID, title, answeredAllQuestions FROM feature ", d);
    for(int i = 0; i < c.getCount(); i++) {
            c.moveToPosition(i);
            features.add(new Feature(c.getInt(0),c.getFloat(1),c.getFloat(2),c.getInt(3),c.getString(4),c.getInt(5)));
    }
    db.close();
    return features;
}*/


    public Suds getSuds(int id) {
    	Suds f = null;
    	SQLiteDatabase db = getReadableDatabase();
    	String[] d = { Integer.toString(id) };
    	Cursor c = db.rawQuery("SELECT "+BaseColumns._ID+", activity, suds, time FROM suds WHERE "+BaseColumns._ID+"=?", d);
    	if (c.getCount() > 0){
    		c.moveToPosition(0);
    		f = new Suds(c.getInt(0),c.getString(1),c.getInt(2),c.getLong(3));
    	}
    	db.close();
    	return f;
    }

@Override
public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	// TODO Auto-generated method stub
	
}

}


