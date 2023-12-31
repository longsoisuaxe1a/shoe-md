package com.springframework.vn.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "giay_hoadon")
public class Giay_HoaDon implements Serializable{

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
	@JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	@Override
	public int hashCode() {
		return Objects.hash(giay, hoaDon);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Giay_HoaDon other = (Giay_HoaDon) obj;
		return Objects.equals(giay, other.giay) && Objects.equals(hoaDon, other.hoaDon);
	}
	public Giay_HoaDon(Giay giay, HoaDon hoaDon) {
		super();
		this.giay = giay;
		this.hoaDon = hoaDon;
	}
	@Override
	public String toString() {
		return "Giay_HoaDon [giay=" + giay + ", hoaDon=" + hoaDon + "]";
	}
	public Giay getGiay() {
		return giay;
	}
	public void setGiay(Giay giay) {
		this.giay = giay;
	}
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public Giay_HoaDon() {
		// TODO Auto-generated constructor stub
	}
}
