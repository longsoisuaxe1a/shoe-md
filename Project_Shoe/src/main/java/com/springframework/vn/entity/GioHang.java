package com.springframework.vn.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giohang")
public class GioHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maGioHang;
	private int soLuong;
	@OneToMany(mappedBy = "gioHang")
	private List<Giay_GioHang> giay_GioHangs;
	@OneToOne
	@MapsId
	@JoinColumn(name = "maNguoiDung")
	private NguoiDung nguoiDung;
	public GioHang() {
		// TODO Auto-generated constructor stub
	}
	public GioHang(int maGioHang, int soLuong) {
		super();
		this.maGioHang = maGioHang;
		this.soLuong = soLuong;
	}
	public int getMaGioHang() {
		return maGioHang;
	}
	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "GioHang [maGioHang=" + maGioHang + ", soLuong=" + soLuong + "]";
	}
}
