package io.github.cho3en1.service;

import java.util.List;

import io.github.cho3en1.model.User;

public interface IUserService {
	
	public boolean addOrUpdateUser(User user);
	public User checkUser(User user);
}
