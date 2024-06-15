package com.demo.springboot.mvc.app.service;

import javax.print.attribute.standard.JobOriginatingUserName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.mvc.app.dto.UserModel;
import com.demo.springboot.mvc.app.entity.UserInformation;
import com.demo.springboot.mvc.app.repository.UserRepository;

@Service
public class UserServices {
	@Autowired
	UserRepository repository;
	
	public String userRegister(UserModel user) {
		
		if(repository.findByEmail(user.getEmail()) != null) {
			return "Email is already Registereed....!" ;
			
		}
		
		UserInformation userInfo = new UserInformation();
		userInfo.setUsername(user.getUsername());
		userInfo.setEmail(user.getEmail());
		userInfo.setPassword(user.getPassword());
		userInfo.setAddress(user.getAddress());
		userInfo.setContact(user.getContact());
		userInfo.setZipcode(user.getZipcode());
		repository.save(userInfo);
		
		return "Your Registration Successfully Completed...!"   ;
	}

	//Login Operation
	
	public String validateUser(String username, String password) {
		
		UserInformation userInfo = repository.findByUsernameAndPassword(username, password);
		if (userInfo == null) { 
	 	 	return "Invalid Credentials. Please Try again"; 
	 	}  else { 
	 	 	return " Welcome To application  " ; 
	      	}

	}
}
