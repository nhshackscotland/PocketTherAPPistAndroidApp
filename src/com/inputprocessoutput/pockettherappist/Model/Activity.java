package com.inputprocessoutput.pockettherappist.Model;

import java.lang.String;

public class Activity {

	protected int id;
	protected String activity_name;
	protected int starting_suds;
	protected long activity_created;

	public Activity(int id, String activity_name, int starting_suds, long activity_created) {
		super();
		this.id = id;
		this.activity_name = activity_name;
		this.starting_suds = starting_suds;
		this.activity_created = activity_created;
	}

	public int getId() {
		return id;
	}
	
	public String getActivityName() {
		return activity_name;
	}
	
	public int getStartingSuds() {
		return starting_suds;
	}
	
	public long getActivityCreated() {
		return activity_created;
	}

}
