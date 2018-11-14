package com.tsl.po;

import java.util.Date;

public class CustomRoomPo {

	private int id;
	private int c_id;//客房ID，t_custom外键
	private int gr_id;//房间ID，t_gestroom外键
	private Date cr_into_time;//入住时间
	private Date cr_out_time;//截止时间
	private float cr_other_cost;
	private float cr_allcost;
	private int u_id;//t_user外键
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getGr_id() {
		return gr_id;
	}
	public void setGr_id(int gr_id) {
		this.gr_id = gr_id;
	}
	public Date getCr_into_time() {
		return cr_into_time;
	}
	public void setCr_into_time(Date cr_into_time) {
		this.cr_into_time = cr_into_time;
	}
	public Date getCr_out_time() {
		return cr_out_time;
	}
	public void setCr_out_time(Date cr_out_time) {
		this.cr_out_time = cr_out_time;
	}
	public float getCr_other_cost() {
		return cr_other_cost;
	}
	public void setCr_other_cost(float cr_other_cost) {
		this.cr_other_cost = cr_other_cost;
	}
	public float getCr_allcost() {
		return cr_allcost;
	}
	public void setCr_allcost(float cr_allcost) {
		this.cr_allcost = cr_allcost;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
}
