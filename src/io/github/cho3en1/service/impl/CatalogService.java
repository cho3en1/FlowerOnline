package io.github.cho3en1.service.impl;

import java.util.List;

import io.github.cho3en1.dao.ICatalogDAO;

import io.github.cho3en1.service.ICatalogService;

public class CatalogService implements ICatalogService {
	private ICatalogDAO catalogDAO;

	public ICatalogDAO getCatalogDAO() {
		return catalogDAO;
	}

	public void setCatalogDAO(ICatalogDAO catalogDAO) {
		this.catalogDAO = catalogDAO;
	}

	@Override
	public List getAllCatalogs() {
		// TODO Auto-generated method stub

		return catalogDAO.getAllCatalogs();
	}

}
