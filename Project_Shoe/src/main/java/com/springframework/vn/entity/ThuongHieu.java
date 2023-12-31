package com.springframework.vn.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="thuonghieu")
public class ThuongHieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maThuongHieu;
	@Column(columnDefinition = "nvarchar(50)")
	private String tenThuongHieu;
	@OneToMany(mappedBy = "thuongHieu")
	private List<Giay> giays;
	@Override
	public String toString() {
		return "ThuongHieu [maThuongHieu=" + maThuongHieu + ", tenThuongHieu=" + tenThuongHieu + "]";
	}
	public int getMaThuongHieu() {
		return maThuongHieu;
	}
	public void setMaThuongHieu(int maThuongHieu) {
		this.maThuongHieu = maThuongHieu;
	}
	public String getTenThuongHieu() {
		return tenThuongHieu;
	}
	public void setTenThuongHieu(String tenThuongHieu) {
		this.tenThuongHieu = tenThuongHieu;
	}
	public ThuongHieu(int maThuongHieu, String tenThuongHieu) {
		super();
		this.maThuongHieu = maThuongHieu;
		this.tenThuongHieu = tenThuongHieu;
	}
	public ThuongHieu() {
		// TODO Auto-generated constructor stub
	}
}
