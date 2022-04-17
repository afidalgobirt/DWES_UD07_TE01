package com.example.dwesud07te01.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.dwesud07te01.entity.Articulo;

@Repository
public class ArticuloDAOImplementation implements ArticuloDAO {
	@Autowired
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public List<Articulo> getAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Articulo> query = session.createQuery("from Articulo", Articulo.class);
		
		return query.getResultList();
	}

	@Override
	@Transactional
	public Articulo getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		
		return session.get(Articulo.class, id);
	}

	@Override
	@Transactional
	public Articulo post(Articulo articulo) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(articulo);
		
		return articulo;
	}

	@Override
	@Transactional
	public Articulo put(Articulo articulo) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(articulo);
		
		return articulo;
	}

	@Override
	@Transactional
	public Articulo delete(int id) {
		Articulo articulo = this.getById(id);
		Session session = entityManager.unwrap(Session.class);
		Query<Articulo> query = session.createQuery("delete from Articulo where id = ?1");
		
		query.setParameter(1, id);
		query.executeUpdate();
		
		return articulo;
	}

}
