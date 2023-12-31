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
@Table(name = "loaigiay")
public class LoaiGiay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoai;
	@Column(columnDefinition = "nvarchar(50)")
	private String tenLoai;
	@OneToMany(mappedBy = "loaiGiay")
	private List<Giay> giays;
	public LoaiGiay() {
		// TODO Auto-generated constructor stub
	}
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public LoaiGiay(int maLoai, String tenLoai) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}
	@Override
	public String toString() {
		return "LoaiGiay [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
}
