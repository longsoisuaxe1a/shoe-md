package com.springframework.vn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.vn.dao.NguoiDungDao;
import com.springframework.vn.entity.NguoiDung;
@Service
public class NguoiDungServiceImpl implements NguoiDungService{
	@Autowired
	private NguoiDungDao dao;
	@Transactional
	@Override
	public List<NguoiDung> getAllList() {
		return dao.getAllList();
	}
	@Transactional
	@Override
	public NguoiDung getNguoiDungById(int id) {
		return dao.getNguoiDungById(id);
	}
	@Transactional
	@Override
	public void add(NguoiDung nguoiDung) {
		dao.add(nguoiDung);
	}
	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}
	@Transactional
	@Override
	public void update(NguoiDung nguoiDung) {
		dao.update(nguoiDung);
	}
	@Transactional
	@Override
	public NguoiDung getNguoiDungByTenDangNhapAndMatKhau(String tenDangNhap, String matKhau) {
		return dao.getNguoiDungByTenDangNhapAndMatKhau(tenDangNhap, matKhau);
	}

}
