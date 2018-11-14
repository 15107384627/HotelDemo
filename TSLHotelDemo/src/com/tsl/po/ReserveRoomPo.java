package com.tsl.po;

public class ReserveRoomPo {

	private int id;
	private int c_id;//Íâ¼ü
	private int gr_id;//Íâ¼ü
	private String rm_into_time;
	private int rm_days;
	private float rm_moeny;
	private int u_id;//Íâ¼ü
	
	@Override
	public String toString() {
		return "ReserveRoomPo [id=" + id + ", c_id=" + c_id + ", gr_id=" + gr_id + ", rm_into_time=" + rm_into_time
				+ ", rm_days=" + rm_days + ", rm_moeny=" + rm_moeny + ", u_id=" + u_id + "]";
	}
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
	public String getRm_into_time() {
		return rm_into_time;
	}
	public void setRm_into_time(String rm_into_time) {
		this.rm_into_time = rm_into_time;
	}
	public int getRm_days() {
		return rm_days;
	}
	public void setRm_days(int rm_days) {
		this.rm_days = rm_days;
	}
	public float getRm_moeny() {
		return rm_moeny;
	}
	public void setRm_moeny(float rm_moeny) {
		this.rm_moeny = rm_moeny;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
}
