package com.springframework.vn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.vn.dao.ThuongHieuDao;
import com.springframework.vn.entity.ThuongHieu;
@Service
public class ThuongHieuServiceImpl implements ThuongHieuService{
	@Autowired
	private ThuongHieuDao dao;
	@Transactional
	@Override
	public List<ThuongHieu> getAllList() {
		return dao.getAllList();
	}
	@Transactional
	@Override
	public ThuongHieu getThuongHieuById(int id) {
		return dao.getThuongHieuById(id);
	}
	@Transactional
	@Override
	public void add(ThuongHieu thuongHieu) {
		dao.add(thuongHieu);
	}
	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}
	@Transactional
	@Override
	public void update(ThuongHieu thuongHieu) {
		dao.update(thuongHieu);
	}

}
