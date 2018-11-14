package com.tsl.po;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class GestroomPo {

	private int id;
	private String gr_num;
	private String gr_name;
	private String gr_des;//√Ë ˆ
	private String gr_img;
	private float gr_price;
	
//	private List<MultipartFile> gr_img;
	
	public GestroomPo() {
		
	}
	
	@Override
	public String toString() {
		return "GestroomPo [id=" + id + ", gr_num=" + gr_num + ", gr_name=" + gr_name + ", gr_des=" + gr_des
				+ ", gr_img=" + gr_img + ", gr_price=" + gr_price + "]";
	}
	
//
//	public List<MultipartFile> getGr_img() {
//		return gr_img;
//	}
//
//
//	public void setGr_img(List<MultipartFile> gr_img) {
//		this.gr_img = gr_img;
//	}


	public GestroomPo(String gr_num, String gr_name, String gr_des, String gr_img, float gr_price) {
		this.gr_num = gr_num;
		this.gr_name = gr_name;
		this.gr_des = gr_des;
		this.gr_img = gr_img;
		this.gr_price = gr_price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGr_num() {
		return gr_num;
	}
	public void setGr_num(String gr_num) {
		this.gr_num = gr_num;
	}
	public String getGr_name() {
		return gr_name;
	}
	public void setGr_name(String gr_name) {
		this.gr_name = gr_name;
	}
	public String getGr_des() {
		return gr_des;
	}
	public void setGr_des(String gr_des) {
		this.gr_des = gr_des;
	}
	public String getGr_img() {
		return gr_img;
	}
	public void setGr_img(String gr_img) {
		this.gr_img = gr_img;
	}
	public float getGr_price() {
		return gr_price;
	}
	public void setGr_price(float gr_price) {
		this.gr_price = gr_price;
	}
}
