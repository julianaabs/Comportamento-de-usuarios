package model;

import java.util.Date;

public class Http extends DefaultRegister {

	private String url;

	public Http(String id, Date date, String user, String pc_id, String url) {
		super(id, date, user, pc_id);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
