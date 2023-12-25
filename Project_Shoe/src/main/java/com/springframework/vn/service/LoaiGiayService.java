package com.springframework.vn.service;

import java.util.List;

import com.springframework.vn.entity.LoaiGiay;

public interface LoaiGiayService {
	public List<LoaiGiay> getAllList();
	public LoaiGiay getLoaiGiayById(int id);
	public void add(LoaiGiay loaiGiay);
	public void delete(int id);
	public void update(LoaiGiay loaiGiay);
}
