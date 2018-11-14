package com.tsl.po;

public class UserPo {

	private int id;
	private String u_name;
	private String u_pwd;
	private String u_dec;//÷∞Œª√Ë ˆ

	
	@Override
	public String toString() {
		return "UserPo [id=" + id + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_dec=" + u_dec + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_pwd() {
		return u_pwd;
	}

	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}

	public String getU_dec() {
		return u_dec;
	}

	public void setU_dec(String u_dec) {
		this.u_dec = u_dec;
	}

}
