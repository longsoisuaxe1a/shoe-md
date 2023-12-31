package com.springframework.vn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springframework.vn.entity.ThuongHieu;
@Repository
public class ThuongHieuDaoImpl implements ThuongHieuDao{
	@Autowired
	private SessionFactory factory;
	@Transactional
	@Override
	public List<ThuongHieu> getAllList() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from ThuongHieu", ThuongHieu.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public ThuongHieu getThuongHieuById(int id) {
		Session session = factory.getCurrentSession();
		return session.get(ThuongHieu.class, id);
	}
	@Transactional
	@Override
	public void add(ThuongHieu thuongHieu) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(thuongHieu);
	}
	@Transactional
	@Override
	public void delete(int id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from ThuongHieu where maThuongHieu=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	@Transactional
	@Override
	public void update(ThuongHieu thuongHieu) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("update ThuongHieu set tenThuongHieu=:name where maThuongHieu=:id");
		query.setParameter("name", thuongHieu.getTenThuongHieu());
		query.setParameter("id", thuongHieu.getMaThuongHieu());
		query.executeUpdate();
	}

}
