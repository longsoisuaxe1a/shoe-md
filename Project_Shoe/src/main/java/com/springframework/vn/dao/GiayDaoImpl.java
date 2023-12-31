package com.springframework.vn.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springframework.vn.entity.Giay;
@Repository
public class GiayDaoImpl implements GiayDao{
	@Autowired
	private SessionFactory factory;
	@Transactional
	@Override
	public List<Giay> getAllList() {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("from Giay", Giay.class);
		return query.getResultList();
	}
	@Transactional
	@Override
	public Giay getGiayById(int id) {
		Session session = factory.getCurrentSession();
		return session.get(Giay.class, id);
	}
	@Transactional
	@Override
	public void add(Giay thuongHieu) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(thuongHieu);
	}
	@Transactional
	@Override
	public void delete(int id) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("delete from Giay where maGiay=:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}
	@Transactional
	@Override
	public void update(Giay giay) {
		Session session = factory.getCurrentSession();
		Query query = session.createQuery("update Giay set tenGiay=:name,"
				+ " size=:size, gia=:gia, phongCach=:phongCach, kieuDang=:kieuDang, moTa=:moTa,"
				+ " mauSac=:mauSac, trongLuong=:trongLuong, chatLieu=:chatLieu where maGiay=:id");
		query.setParameter("name", giay.getTenGiay());
		query.setParameter("size", giay.getSize());
		query.setParameter("gia", giay.getGia());
		query.setParameter("phongCach", giay.getPhongCach());
		query.setParameter("kieuDang", giay.getKieuDang());
		query.setParameter("moTa", giay.getChiTietGiay().getMoTa());
		query.setParameter("mauSac", giay.getChiTietGiay().getMauSac());
		query.setParameter("trongLuong", giay.getChiTietGiay().getTrongLuong());
		query.setParameter("chatLieu", giay.getChiTietGiay().getChatLieu());
		query.setParameter("id", giay.getMaGiay());
		query.executeUpdate();
	}
}
