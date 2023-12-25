package com.springframework.vn.dao;

import java.util.List;

import com.springframework.vn.entity.NguoiDung;


public interface NguoiDungDao {
	public List<NguoiDung> getAllList();
	public NguoiDung getNguoiDungById(int id);
	public void add(NguoiDung nguoiDung);
	public void delete(int id);
	public void update(NguoiDung nguoiDung);
	public NguoiDung getNguoiDungByTenDangNhapAndMatKhau(String tenDangNhap, String matKhau);
}
