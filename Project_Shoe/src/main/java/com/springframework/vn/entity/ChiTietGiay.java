package com.springframework.vn.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietGiay {
	@Column(columnDefinition = "nvarchar(50)")
	private String moTa;
	@Column(columnDefinition = "nvarchar(50)")
	private String mauSac;
	private double trongLuong;
	@Column(columnDefinition = "nvarchar(50)")
	private String chatLieu;
	public ChiTietGiay() {
		// TODO Auto-generated constructor stub
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public double getTrongLuong() {
		return trongLuong;
	}
	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}
	public String getChatLieu() {
		return chatLieu;
	}
	public void setChatLieu(String chatLieu) {
		this.chatLieu = chatLieu;
	}
	public ChiTietGiay(String moTa, String mauSac, double trongLuong, String chatLieu) {
		super();
		this.moTa = moTa;
		this.mauSac = mauSac;
		this.trongLuong = trongLuong;
		this.chatLieu = chatLieu;
	}
	@Override
	public String toString() {
		return "ChiTietGiay [moTa=" + moTa + ", mauSac=" + mauSac + ", trongLuong=" + trongLuong + ", chatLieu="
				+ chatLieu + "]";
	}
}
