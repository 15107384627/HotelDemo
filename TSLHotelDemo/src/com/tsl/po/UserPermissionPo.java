package com.tsl.po;

public class UserPermissionPo {

	private int id;
	private int u_id;
	private int p_id;

	@Override
	public String toString() {
		return "UserPermissionPo [id=" + id + ", u_id=" + u_id + ", p_id=" + p_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
}
