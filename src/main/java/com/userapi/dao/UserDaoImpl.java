package com.userapi.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.userapi.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	List<User> ListOfUser = new ArrayList<User>();

	public UserDaoImpl() {
		
	
		ListOfUser.add(new User(0, "Shahu",26, "shahu@gmail.com",35000, "Kolhapur", 9403468811L));
		ListOfUser.add(new User(1, "Nilesh",30, "nilesh@gmail.com",30000, "Pune", 9425648511L));
		ListOfUser.add(new User(2, "Viraj",22, "viraj@gmail.com",28000, "Mumbai", 6935241711L));
		ListOfUser.add(new User(3, "Vikram",35, "vikram@gmail.com",45000, "Kolhapur", 9403258479L));
		ListOfUser.add(new User(4, "Rahul", 28,"rahul@gmail.com",40000, "Satara", 923659874L));
		ListOfUser.add(new User(5, "Akshay",20, "akshay@gmail.com",20000, "Kolhapur", 9236591874L));
		ListOfUser.add(new User(6, "Chetan",24, "chetan@gmail.com",15000, "Satara", 9236598741L));
		ListOfUser.add(new User(7, "Niraj", 28, "niraj@gmail.com", 25000, "Satara", 5546665851L));
	}

	@Override
	public List<User> getuserList() {

		return ListOfUser;
	}

	@Override
	public String adduser(User user) {
		String message = "User not added";

		ListOfUser.add(user);
		message = "User added successfully";
		return message;
	}

	@Override
	public User getById(int userId) {
		int id = userId;
		User usr = null;
		for (User user : ListOfUser) {
			if (user.getUserId() == id) {
				usr = user;
			}

		}
		return usr;
	}

	@Override
	public List<User> getUserByCity(String userCity) {
		String cityOfUser = userCity;
		List<User> list = new ArrayList<User>();
		for (User user : ListOfUser) {
			if (userCity.equals(user.getUserCity())) {
				list.add(user);
			}

		}
		return list;
	}

	@Override
	public List<User> getlistInAscending() {
		List<User> sortedList = ListOfUser.stream().sorted(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				int value = o1.getUserName().compareTo(o2.getUserName());
				return value;
			}
		}).collect(Collectors.toList());
		return sortedList;

	}

	@Override
	public String updateUser(User user) {
		String message = "User not Updated";
		int id = user.getUserId();
		for (User user2 : ListOfUser) {
			if (user2.getUserId() == user.getUserId()) {
				User usr = ListOfUser.get(id);
				ListOfUser.remove(usr);
				break;

			} else {
				message = "for this Id User is not present";
			}
		}
		ListOfUser.add(user);
		message = "User Updated Successfully";

		return message;
	}

	@Override
	public String deleteUserById(int userId) {
		int id = userId;
		User usr =ListOfUser.get(id);
		ListOfUser.remove(usr);
		return "User Deleted Successfully";
	}

	@Override
	public List<User> getUserOrderedByAge() {
	List<User> userSortedByAge=ListOfUser.stream().sorted((o1,o2) -> (o1.getUserAge() - o2.getUserAge()))
			.collect(Collectors.toList());
		return userSortedByAge;
	}

	@Override
	public List<User> getUserOrderedbyIncome() {
	 List<User> list=ListOfUser.stream().sorted((user1,user2) -> (int)(user1.getUserIncome() -user2.getUserIncome()))
	 .collect(Collectors.toList());
		return list;
	}

	@Override
	public Optional<User> getUserWithMaxSal() {
		Optional<User> user=ListOfUser.stream().collect(Collectors.maxBy(Comparator.comparingDouble(User::getUserIncome)));
		return user;
	}

	@Override
	public Optional<User> getUserWithMaxAge() {
		Optional<User> user=ListOfUser.stream().collect(Collectors.maxBy(Comparator.comparingInt(User::getUserAge)));
		return user;
	}

	@Override
	public Optional<User> getUserWithMinsal() {
		Optional<User> user=ListOfUser.stream().collect(Collectors.minBy(Comparator.comparingDouble(User::getUserIncome)));
		return user;
	}

}
