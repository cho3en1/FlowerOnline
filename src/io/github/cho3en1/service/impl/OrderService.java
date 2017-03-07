package io.github.cho3en1.service.impl;


import io.github.cho3en1.dao.IOrderDAO;
import io.github.cho3en1.dao.impl.OrderDAO;
import io.github.cho3en1.model.Orders;
import io.github.cho3en1.service.IOrderService;

public class OrderService implements IOrderService{
private IOrderDAO orderDAO;

	
	public IOrderDAO getOrderDAO() {
	return orderDAO;
}


public void setOrderDAO(IOrderDAO orderDAO) {
	this.orderDAO = orderDAO;
}


	@Override
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderDAO.saveOrder(order);
	}

}
