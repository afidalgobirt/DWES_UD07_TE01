package com.example.dwesud07te01.service;

import java.util.List;

import com.example.dwesud07te01.entity.Articulo;

public interface ArticuloService {
	/**
	 * Retrieves all articles from the DB.
	 * 
	 * @return A List of all Articles from the DB.
	 */
	public List<Articulo> getAll();
	
	/**
	 * Retrieves the article with the given id from the DB.
	 * 
	 * @param id Id of the Article to be retrieved.
	 * @return The Article with the given Id.
	 */
	public Articulo getById(int id);
	
	/**
	 * Posts a new Article in the DB.
	 * 
	 * @param articulo Article to be posted.
	 * @return The Article that has been posted.
	 */
	public Articulo post(Articulo articulo);
	
	/**
	 * Puts an Article of the DB with the given data.
	 * 
	 * @param articulo Article to be put.
	 * @return The Article that has been put.
	 */
	public Articulo put(Articulo articulo);
	
	/**
	 * Deletes an Article from the DB.
	 * 
	 * @param id Id of the Article to be deleted.
	 * @return The Article that has been deleted.
	 */
	public Articulo delete(int id);
}
