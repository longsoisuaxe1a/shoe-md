package com.springframework.vn.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springframework.vn.entity.NguoiDung;

@Repository
public class NguoiDungDaoImpl implements NguoiDungDao{
	@Autowired
	private SessionFactory factory;
	@Transactional
	@Override
	public List<NguoiDung> getAllList() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from NguoiDung", NguoiDung.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public NguoiDung getNguoiDungById(int id) {
		Session session = factory.getCurrentSession();
		return session.get(NguoiDung.class, id);
	}
	@Transactional
	@Override
	public void add(NguoiDung nguoiDung) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(nguoiDung);
	}
	@Transactional
	@Override
	public void delete(int id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from NguoiDung where maNguoiDung=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	@Transactional
	@Override
	public void update(NguoiDung nguoiDung) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("update NguoiDung set tenNguoiDung=:tenNguoiDung, matKhau=:matKhau, email=:email, role=:role where maNguoiDung=:maNguoiDung");
		query.setParameter("tenNguoiDung", nguoiDung.getTenNguoiDung());
		query.setParameter("matKhau", nguoiDung.getMatKhau());
		query.setParameter("email", nguoiDung.getEmail());
		query.setParameter("role", nguoiDung.getRole());
		query.setParameter("maNguoiDung", nguoiDung.getMaNguoiDung());
		query.executeUpdate();
	}
	@Transactional
	@Override
	public NguoiDung getNguoiDungByTenDangNhapAndMatKhau(String tenNguoiDung, String matKhau) {
		Session session = factory.getCurrentSession();
		TypedQuery<NguoiDung> query = session.createQuery("from NguoiDung where tenNguoiDung=:name and matKhau=:pass");
		query.setParameter("name", tenNguoiDung);
		query.setParameter("pass", matKhau);
		try {
		    return query.getSingleResult();
		} catch (NoResultException e) {
		    // Xử lý hoặc trả về null
		    return null;
		}
	}

}
