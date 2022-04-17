package com.example.dwesud07te01.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="articulo")
@DynamicUpdate
public class Articulo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idarticulo")
	private int id;
	
	@Column(name="nombreproducto")
	private String name;
	
	@Column(name="descripcion")
	private String description;
	
	@Column(name="precio")
	private float price;
	
	public Articulo() {}
	
	public Articulo(int id, String name, String description, float price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
