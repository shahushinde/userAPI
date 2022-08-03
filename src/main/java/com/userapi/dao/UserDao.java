package com.userapi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.userapi.model.User;

public interface UserDao {
	
	public List<User>  getuserList();

	public String adduser(User user);

	public User getById(int userId);

	public List<User> getUserByCity(String userCity);

	public List<User> getlistInAscending();

	public String updateUser(User user);

	public String deleteUserById(int userId);

	public List<User> getUserOrderedByAge();

	public List<User> getUserOrderedbyIncome();

	public Optional<User> getUserWithMaxSal();

	public Optional<User> getUserWithMaxAge();

	public Optional<User> getUserWithMinsal();
		
	
	

}
