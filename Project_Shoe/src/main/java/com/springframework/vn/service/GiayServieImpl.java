package com.springframework.vn.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.vn.dao.GiayDao;
import com.springframework.vn.entity.Giay;
@Service
public class GiayServieImpl implements GiayService{
	@Autowired
	private GiayDao dao;
	@Transactional
	@Override
	public List<Giay> getAllList() {
		return dao.getAllList();
	}
	@Transactional
	@Override
	public Giay getGiayById(int id) {
		return dao.getGiayById(id);
	}
	@Transactional
	@Override
	public void add(Giay giay) {
		dao.add(giay);
	}
	@Transactional
	@Override
	public void delete(int id) {
		dao.delete(id);
	}
	@Transactional
	@Override
	public void update(Giay giay) {
		dao.update(giay);
	}
	
}
