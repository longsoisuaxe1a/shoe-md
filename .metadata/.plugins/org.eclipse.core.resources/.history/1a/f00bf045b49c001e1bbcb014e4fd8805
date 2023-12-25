package com.springframework.vn.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giay_giohang")
public class Giay_GioHang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "maGiay")
	private Giay giay;
	@Id
	@ManyToOne
	@JoinColumn(name = "maGioHang")
	private GioHang gioHang;
	public Giay_GioHang() {
		// TODO Auto-generated constructor stub
	}
	public Giay getGiay() {
		return giay;
	}
	public void setGiay(Giay giay) {
		this.giay = giay;
	}
	public GioHang getGioHang() {
		return gioHang;
	}
	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}
	public Giay_GioHang(Giay giay, GioHang gioHang) {
		super();
		this.giay = giay;
		this.gioHang = gioHang;
	}
	@Override
	public String toString() {
		return "Giay_GioHang [giay=" + giay + ", gioHang=" + gioHang + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(giay, gioHang);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giay_GioHang other = (Giay_GioHang) obj;
		return Objects.equals(giay, other.giay) && Objects.equals(gioHang, other.gioHang);
	}
}
