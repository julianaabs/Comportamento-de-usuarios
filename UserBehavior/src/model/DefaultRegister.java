package model;

import java.util.Date;

public abstract class DefaultRegister {

	String id;
	Date date;
	String user;
	String pc_id;

	public DefaultRegister(String id, Date date, String user, String pc_id) {
		this.id = id;
		this.date = date;
		this.user = user;
		this.pc_id = pc_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPc_id() {
		return pc_id;
	}

	public void setPc_id(String pc_id) {
		this.pc_id = pc_id;
	}

}
