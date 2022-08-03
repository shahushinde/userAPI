package com.userapi.service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userapi.dao.UserDao;
import com.userapi.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao dao;

	@Override
	public List<User>  getuserList() {
		
		return dao.getuserList();
	}

	@Override
	public String adduser(User user) {
		String message=dao.adduser(user);
		return message;
		
	}

	@Override
	public User getById(int userId) {


		return dao.getById(userId);
	}

	@Override
	public List<User> getUserByCity(String userCity) {
	
		return dao.getUserByCity(userCity);
	}

	@Override
	public List<User> getlistInAscending() {
		
		return dao.getlistInAscending();
	}

	@Override
	public String updateUser(User user) {
		
		return dao.updateUser(user);
	}

	@Override
	public String deleteUserById(int userId) {
		
		return dao.deleteUserById(userId);
	}

	@Override
	public List<User> userOrderedByAge() {
		
		return dao.getUserOrderedByAge();
	}

	@Override
	public List<User> getUserOrderedbyIncome() {
	
		return dao.getUserOrderedbyIncome();
	}

	@Override
	public Optional<User> getUserWithMaxSal() {
		
		return dao.getUserWithMaxSal();
	}

	@Override
	public Optional<User> getUserWithMaxAge() {
		
		return dao.getUserWithMaxAge();
	}

	@Override
	public Optional<User> getUserWithMinSal() {
		
		return dao.getUserWithMinsal();
	}




}
