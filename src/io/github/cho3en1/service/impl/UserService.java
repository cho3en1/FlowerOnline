package io.github.cho3en1.service.impl;

import java.util.List;
import io.github.cho3en1.dao.IUserDAO;
import io.github.cho3en1.model.User;
import io.github.cho3en1.service.IUserService;

public class UserService implements IUserService {
private IUserDAO userDAO;

public IUserDAO getUserDAO() {
	return userDAO;
}

public void setUserDAO(IUserDAO userDAO) {
	this.userDAO = userDAO;
}

public boolean addOrUpdateUser(User user) {
	// TODO Auto-generated method stub
	return userDAO.addOrUpdateUser(user);
}
public User checkUser(User user) {
	// TODO Auto-generated method stub
	return userDAO.checkUser(user);
}
}
