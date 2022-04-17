package com.example.dwesud07te01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dwesud07te01.dao.ArticuloDAO;
import com.example.dwesud07te01.entity.Articulo;

@Service
public class ArticuloServiceImplementation implements ArticuloService {
	@Autowired
	ArticuloDAO articuloDAO;
	
	@Override
	public List<Articulo> getAll() {
		return articuloDAO.getAll();
	}

	@Override
	public Articulo getById(int id) {
		return articuloDAO.getById(id);
	}

	@Override
	public Articulo post(Articulo articulo) {
		return articuloDAO.post(articulo);
	}

	@Override
	public Articulo put(Articulo articulo) {
		return articuloDAO.put(articulo);
	}

	@Override
	public Articulo delete(int id) {
		return articuloDAO.delete(id);
	}
}
