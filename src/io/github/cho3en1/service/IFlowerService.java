package io.github.cho3en1.service;

import java.util.List;

import io.github.cho3en1.model.Flower;

public interface IFlowerService {
		public List getNewFlower();
		public List getFlowerByCatalogidPaging(int catalogid,int currentPage,int pageSize);
		public int getTotalByCatalog(int catalogid);
		public Flower getFlowerById(int id); 
}
