package com.example.dwesud07te01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dwesud07te01.entity.Articulo;
import com.example.dwesud07te01.service.ArticuloService;

@RestController
@RequestMapping("/api") // Base URL: http://localhost:8080/api
public class ArticuloController {
	@Autowired
	private ArticuloService articuloService;
	
	@GetMapping("/articulos")
	public List<Articulo> getAll() {
		return articuloService.getAll();
	}
	
	@GetMapping("/articulo/{id}")
	public Articulo getById(@PathVariable int id) {
		return articuloService.getById(id);
	}
	
	@PutMapping("/articulo")
	public Articulo put(@RequestBody Articulo articulo) {
		return articuloService.put(articulo);
	}
	
	@PostMapping("/articulo")
	public Articulo post(@RequestBody Articulo articulo) {
		return articuloService.post(articulo);
	}
	
	@DeleteMapping("/articulo/{id}")
	public Articulo delete(@PathVariable int id) {
		return articuloService.delete(id);
	}
}
