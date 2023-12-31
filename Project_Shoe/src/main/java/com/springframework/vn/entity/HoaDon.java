package com.springframework.vn.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hoadon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	private double tongTien;
	private String ngayDatHang;
	@Embedded
	private ChiTietHoaDon chiTietHoaDon;
	@OneToMany(mappedBy = "hoaDon")
	private List<Giay_HoaDon> giay_HoaDons;
	@ManyToOne
	@JoinColumn(name = "maNguoiDung")
	private NguoiDung nguoiDung;
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", tongTien=" + tongTien + ", ngayDatHang=" + ngayDatHang
				+ ", chiTietHoaDon=" + chiTietHoaDon + "]";
	}
	public HoaDon(int maHoaDon, double tongTien, String ngayDatHang, ChiTietHoaDon chiTietHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.tongTien = tongTien;
		this.ngayDatHang = ngayDatHang;
		this.chiTietHoaDon = chiTietHoaDon;
	}
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public String getNgayDatHang() {
		return ngayDatHang;
	}
	public void setNgayDatHang(String ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}
	public ChiTietHoaDon getChiTietHoaDon() {
		return chiTietHoaDon;
	}
	public void setChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		this.chiTietHoaDon = chiTietHoaDon;
	}
	
}
