package io.github.cho3en1.dao;

import java.util.List;

import io.github.cho3en1.model.User;

public interface IUserDAO {

	public boolean addOrUpdateUser(User user);
	public User checkUser(User user);
}
