package model;

import java.util.Date;

public class Device extends DefaultRegister {
	
	private boolean activity;

	public Device(String id, Date date, String user, String pc_id, boolean activity) {
		super(id, date, user, pc_id);
		this.activity = activity;
	}

	public boolean isActivity() {
		return activity;
	}

	public void setActivity(boolean activity) {
		this.activity = activity;
	}	
	
}
