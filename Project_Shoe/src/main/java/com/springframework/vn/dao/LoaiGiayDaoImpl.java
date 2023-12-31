package com.springframework.vn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springframework.vn.entity.LoaiGiay;
@Repository
public class LoaiGiayDaoImpl implements LoaiGiayDao{
	@Autowired
	private SessionFactory factory;
	@Transactional
	@Override
	public List<LoaiGiay> getAllList() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from LoaiGiay", LoaiGiay.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public LoaiGiay getLoaiGiayById(int id) {
		Session session = factory.getCurrentSession();
		return session.get(LoaiGiay.class, id);
	}
	@Transactional
	@Override
	public void add(LoaiGiay thuongHieu) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(thuongHieu);
	}
	@Transactional
	@Override
	public void delete(int id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from LoaiGiay where maLoai=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	@Transactional
	@Override
	public void update(LoaiGiay thuongHieu) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("update LoaiGiay set tenLoai=:name where maLoai=:id");
		query.setParameter("name", thuongHieu.getTenLoai());
		query.setParameter("id", thuongHieu.getMaLoai());
		query.executeUpdate();
	}
}
