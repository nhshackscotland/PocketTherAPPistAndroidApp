package com.inputprocessoutput.pockettherappist.Model;

import java.lang.String;

public class Suds {

	protected int id;
	protected String activity;
	protected int suds;
	protected long time;

	public Suds(int id, String activity, int suds, long time) {
		super();
		this.id = id;
		this.activity = activity;
		this.suds = suds;
		this.time = time;
	}

	public int getId() {
		return id;
	}
	
	public String getActivity() {
		return activity;
	}
	
	public int getSuds() {
		return suds;
	}
	
	public long getTime() {
		return time;
	}

}