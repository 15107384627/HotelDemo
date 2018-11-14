package com.tsl.po;

public class CustomPo {

	private int id;
	private String c_name;
	private String c_tel;
	private String c_idcard;

	@Override
	public String toString() {
		return "CustomPo [id=" + id + ", c_name=" + c_name + ", c_tel=" + c_tel + ", c_idcard=" + c_idcard + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_tel() {
		return c_tel;
	}

	public void setC_tel(String c_tel) {
		this.c_tel = c_tel;
	}

	public String getC_idcard() {
		return c_idcard;
	}

	public void setC_idcard(String c_idcard) {
		this.c_idcard = c_idcard;
	}
}
