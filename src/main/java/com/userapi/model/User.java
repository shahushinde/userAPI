package com.userapi.model;

public class User {
	
	private int userId;
	private String userName;
	private int userAge;
	private String userEmail;
	private double userIncome;
	private String userCity;
	private long userMobileNo;
	public User(int userId, String userName, int userAge, String userEmail, double userIncome, String userCity,
			long userMobileNo) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.userIncome = userIncome;
		this.userCity = userCity;
		this.userMobileNo = userMobileNo;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userEmail=" + userEmail
				+ ", userIncome=" + userIncome + ", userCity=" + userCity + ", userMobileNo=" + userMobileNo + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public double getUserIncome() {
		return userIncome;
	}
	public void setUserIncome(double userIncome) {
		this.userIncome = userIncome;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public long getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(long userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	
	
	

}
