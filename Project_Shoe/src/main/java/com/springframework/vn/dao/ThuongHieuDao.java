package com.springframework.vn.dao;

import java.util.List;

import com.springframework.vn.entity.ThuongHieu;

public interface ThuongHieuDao {
	public List<ThuongHieu> getAllList();
	public ThuongHieu getThuongHieuById(int id);
	public void add(ThuongHieu thuongHieu);
	public void delete(int id);
	public void update(ThuongHieu thuongHieu);
}
