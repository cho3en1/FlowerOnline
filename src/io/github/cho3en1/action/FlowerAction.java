package io.github.cho3en1.action;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import io.github.cho3en1.service.ICatalogService;
import io.github.cho3en1.service.IFlowerService;
import io.github.cho3en1.util.Pager;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class FlowerAction extends ActionSupport {
	private ICatalogService catalogService;
	private IFlowerService  flowerService;
	private int catalogid;
	private int currentPage=1;
	
	public ICatalogService getCatalogService() {
		return catalogService;
	}

	public void setCatalogService(ICatalogService catalogService) {
		this.catalogService = catalogService;
	}
	
	public IFlowerService getFlowerService() {
		return flowerService;
	}

	public void setFlowerService(IFlowerService flowerService) {
		this.flowerService = flowerService;
	}

	public int getCatalogid() {
		return catalogid;
	}

	public void setCatalogid(int catalogid) {
		this.catalogid = catalogid;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String browseCatalog() throws Exception{

		List catalogs=catalogService.getAllCatalogs();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("catalogs",catalogs);
		return SUCCESS;
	}
	
	public String browseNewFlower() throws Exception{

		List newflowers=flowerService.getNewFlower();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("newflowers",newflowers);
		return SUCCESS;
	}
	
	public String browseFlowerPaging()throws Exception {
		int totalSize=flowerService.getTotalByCatalog(catalogid);
		Pager page=new Pager(currentPage, totalSize);
		List flowers=flowerService.getFlowerByCatalogidPaging(catalogid, currentPage, page.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("flowers",flowers);
		request.put("page",page);
		return SUCCESS;	
	}
}
