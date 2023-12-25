package com.springframework.vn.dao;

import java.util.List;

import com.springframework.vn.entity.Giay;

public interface GiayDao {
	public List<Giay> getAllList();
	public Giay getGiayById(int id);
	public void add(Giay giay);
	public void delete(int id);
	public void update(Giay giay);
}
