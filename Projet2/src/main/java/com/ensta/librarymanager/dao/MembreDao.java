package com.ensta.librarymanager.dao;

import java.util.List;

import com.ensta.librarymanager.exception.DaoException;
import com.ensta.librarymanager.modele.Membre;

public interface MembreDao {
	public List<Membre> getList() throws DaoException;

	public Membre getById(int id) throws DaoException;

	public int create(Membre membre) throws DaoException;

	public void update(Membre membre) throws DaoException;

	public void delete(int id) throws DaoException;

	public int count() throws DaoException;
}
