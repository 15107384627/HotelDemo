package com.tsl.po;

public class PermissionPo {

	private int id;
	private String p_name;
	private String p_url;
	private String p_dec;

	@Override
	public String toString() {
		return "PermissionPo [id=" + id + ", p_name=" + p_name + ", p_url=" + p_url + ", p_dec=" + p_dec + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_url() {
		return p_url;
	}

	public void setP_url(String p_url) {
		this.p_url = p_url;
	}

	public String getP_dec() {
		return p_dec;
	}

	public void setP_dec(String p_dec) {
		this.p_dec = p_dec;
	}
}
