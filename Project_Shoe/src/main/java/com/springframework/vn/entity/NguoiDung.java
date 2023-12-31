package com.springframework.vn.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "nguoidung")
public class NguoiDung {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNguoiDung;
	private String tenNguoiDung;
	private String matKhau;
	private String email;
	private String role;
	@OneToMany(mappedBy = "nguoiDung")
	private List<HoaDon> hoaDons;
	@OneToOne
	@PrimaryKeyJoinColumn
	private GioHang gioHang;
	public NguoiDung() {
		// TODO Auto-generated constructor stub
	}
	public NguoiDung(int maNguoiDung, String tenNguoiDung, String matKhau, String email, String role) {
		super();
		this.maNguoiDung = maNguoiDung;
		this.tenNguoiDung = tenNguoiDung;
		this.matKhau = matKhau;
		this.email = email;
		this.role = role;
	}
	@Override
	public String toString() {
		return "NguoiDung [maNguoiDung=" + maNguoiDung + ", tenNguoiDung=" + tenNguoiDung + ", matKhau=" + matKhau
				+ ", email=" + email + ", role=" + role + "]";
	}
	public int getMaNguoiDung() {
		return maNguoiDung;
	}
	public void setMaNguoiDung(int maNguoiDung) {
		this.maNguoiDung = maNguoiDung;
	}
	public String getTenNguoiDung() {
		return tenNguoiDung;
	}
	public void setTenNguoiDung(String tenNguoiDung) {
		this.tenNguoiDung = tenNguoiDung;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
