package com.springframework.vn.entity;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="giay")
public class Giay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maGiay;
	@Column(columnDefinition = "nvarchar(50)")
	private String tenGiay;
	@Column(columnDefinition = "nvarchar(5)")
	private String size;
	private double gia;
	@Column(columnDefinition = "nvarchar(50)")
	private String phongCach;
	@Column(columnDefinition = "nvarchar(50)")
	private String kieuDang;
	@Embedded
	private ChiTietGiay chiTietGiay;
	@ManyToOne
	@JoinColumn(name="maThuongHieu")
	private ThuongHieu thuongHieu;
	@ManyToOne
	@JoinColumn(name="maLoai")
	private LoaiGiay loaiGiay;
	@OneToMany(mappedBy = "giay")
	private List<Giay_HoaDon> giay_HoaDons;
	@OneToMany(mappedBy = "giay")
	private List<Giay_GioHang> giay_GioHangs;
	public Giay() {
		// TODO Auto-generated constructor stub
	}
	public int getMaGiay() {
		return maGiay;
	}
	public void setMaGiay(int maGiay) {
		this.maGiay = maGiay;
	}
	public String getTenGiay() {
		return tenGiay;
	}
	public void setTenGiay(String tenGiay) {
		this.tenGiay = tenGiay;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getPhongCach() {
		return phongCach;
	}
	public void setPhongCach(String phongCach) {
		this.phongCach = phongCach;
	}
	public String getKieuDang() {
		return kieuDang;
	}
	public void setKieuDang(String kieuDang) {
		this.kieuDang = kieuDang;
	}
	public Giay(int maGiay, String tenGiay, String size, double gia, String phongCach, String kieuDang,
			ChiTietGiay chiTietGiay) {
		super();
		this.maGiay = maGiay;
		this.tenGiay = tenGiay;
		this.size = size;
		this.gia = gia;
		this.phongCach = phongCach;
		this.kieuDang = kieuDang;
		this.chiTietGiay = chiTietGiay;
	}
	@Override
	public String toString() {
		return "Giay [maGiay=" + maGiay + ", tenGiay=" + tenGiay + ", size=" + size + ", gia=" + gia + ", phongCach="
				+ phongCach + ", kieuDang=" + kieuDang + ", chiTietGiay=" + chiTietGiay + "]";
	}
	public ChiTietGiay getChiTietGiay() {
		return chiTietGiay;
	}
	public void setChiTietGiay(ChiTietGiay chiTietGiay) {
		this.chiTietGiay = chiTietGiay;
	}
	
	
}
