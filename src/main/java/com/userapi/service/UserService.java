package com.userapi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.userapi.model.User;

public interface UserService {

	public List<User>  getuserList();

	public String adduser(User user);

	public User getById(int userId);

	public List<User> getUserByCity(String userCity);

	public List<User> getlistInAscending();

	public String updateUser(User user);

	public String deleteUserById(int i);

	public List<User> userOrderedByAge();

	public List<User> getUserOrderedbyIncome();

	public Optional<User> getUserWithMaxSal();

	public Optional<User> getUserWithMaxAge();

	public Optional<User> getUserWithMinSal();

}
	
