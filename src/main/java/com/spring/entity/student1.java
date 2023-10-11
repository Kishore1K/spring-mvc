package com.spring.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class student1 {
	
	private String userName;
	
	private Long userId;
	
	@DateTimeFormat(pattern = "dd/MM/YYYY")
	private Date dob;
	
	private List<String> courses;
	private String userEmail;
	private String gender;
	
	private String type;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}



	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob =dob;
		
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "student1 [userName=" + userName + ", id=" + userId + ", dob=" + dob + ", courses=" + courses + ", email="
				+ userEmail + ", gender=" + gender + ", type=" + type + "]";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	

}
