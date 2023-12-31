package com.springframework.vn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.vn.dao.LoaiGiayDao;
import com.springframework.vn.entity.LoaiGiay;
@Service
public class LoaiGiayServiceImpl implements LoaiGiayService{
	@Autowired
	private LoaiGiayDao dao;
	@Transactional
	@Override
	public List<LoaiGiay> getAllList() {
		return dao.getAllList();
	}
	@Transactional
	@Override
	public LoaiGiay getLoaiGiayById(int id) {
		return dao.getLoaiGiayById(id);
	}
	@Transactional
	@Override
	public void add(LoaiGiay loaiGiay) {
		dao.add(loaiGiay);
	}
	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}
	@Transactional
	@Override
	public void update(LoaiGiay loaiGiay) {
		dao.update(loaiGiay);
	}

}
