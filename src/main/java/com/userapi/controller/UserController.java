package com.userapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userapi.model.User;
import com.userapi.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("adduser")
	public String addUser(@RequestBody User user) {
		String message=service.adduser(user);
		return message;
		
	}
	
	@GetMapping("displayUserList")
	public List<User> getUserList() {
		List<User> ListOfUser=service.getuserList();
		return ListOfUser;
		
	}
	
	@GetMapping("getbyid/{userId}")
	public User getUserById(@PathVariable String userId) {
		User user=service.getById(Integer.parseInt(userId));
		return user;
		
	}
	
	@GetMapping("GetUserByCity/{userCity}")
	public List<User> getUserByCity(@PathVariable String userCity) {
		
		return service.getUserByCity(userCity);
		
	}
	
	@GetMapping("GetUserInOrder")
	public List<User> getlistInAscending(){
		return service.getlistInAscending();
		
	}
	
	@PutMapping("updateUser")
	public String updateUser(@RequestBody User user) {
		return service.updateUser(user);
		
	}
	
	@DeleteMapping("deleteUserById/{userId}")
	public String DeleteUserById(@PathVariable String userId) {
		String message=service.deleteUserById(Integer.parseInt(userId));
		return message;
		
	}
	
	@GetMapping("getUserOrderedByAge")
	public List<User> userOrderedByAge(){
		
		List<User> list=service.userOrderedByAge();
		return list;
		
	}
	
	@GetMapping("getUserOrderedbyIncome")
	public List<User> getUserOrderedbyIncome(){
		List<User> list=service.getUserOrderedbyIncome();
		return list;
		
	}
	
	@GetMapping("getUserWithMaxSal")
	public Optional<User> getUserWithMaxSal() {
		Optional<User> user=service.getUserWithMaxSal();
		
		return user;
		
	}
	
	@GetMapping("getUserWithMinSal")
	public Optional<User> getUserWithMinSal(){
		
		Optional<User> user=service.getUserWithMinSal();
		return user;
		                 
	}
	
	@GetMapping("getUserWithMaxAge")
	public Optional<User> getUserWithMaxAge(){
		Optional<User> user=service.getUserWithMaxAge();
		return user;
		
	}

}
