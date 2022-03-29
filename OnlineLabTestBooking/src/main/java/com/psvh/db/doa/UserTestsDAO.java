package com.psvh.db.doa;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Query;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Restrictions;

import org.hibernate.exception.ConstraintViolationException;

import com.psvh.db.pojo.UserTests;

public class UserTestsDAO {

	public String insert(UserTests ut) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		s.save(ut);

		s.getTransaction().commit();

		return "test booked";

	}

	public List<UserTests> listByUsername(String username) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		Criteria c = s.createCriteria(UserTests.class);

		c.add(Restrictions.eq("username", username));

		List<UserTests> li = c.list();

		s.getTransaction().commit();

		return li;

	}

	public List<UserTests> display() {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		Criteria c = s.createCriteria(UserTests.class);

		List<UserTests> li = c.list();

		s.getTransaction().commit();

		return li;

	}

	public int updateTest(int id, String status) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		Query q = s.createQuery("update UserTests set status=:n where orderno=:i");

		q.setParameter("n", status);

		q.setParameter("i", id);

		int update = q.executeUpdate();

		s.getTransaction().commit();

		return update;

	}

	public int updateUserTest(int id, String username) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		Query q = s.createQuery("update UserTests set status=:n where orderno=:i and username=:u");

		q.setParameter("n", "Cancelled");

		q.setParameter("i", id);

		q.setParameter("u", username);

		int status = q.executeUpdate();

		s.getTransaction().commit();

		return status;

	}

	public List<UserTests> search(Date date) {

		Configuration cfg = new Configuration();

		cfg.configure("hibernate2.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		s.beginTransaction();

		Criteria c = s.createCriteria(UserTests.class);

		c.add(Restrictions.eq("testdate", date));

		List<UserTests> li = c.list();

		s.getTransaction().commit();

		return li;

	}

}