package com.demo.springboot.mvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.springboot.mvc.app.dto.UserModel;
import com.demo.springboot.mvc.app.service.UserServices;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class UserRegController {
	@Autowired
	UserServices userService;
	
	@GetMapping("/register")
	public String disRegForm(Model model ) {
		
		model.addAttribute("user", new UserModel());
		
		return "registration";
	}
	
	@PostMapping("user/register")
	public String userRegister(HttpServletRequest request, Model model) {
		//TODO: process POST request
		UserModel user = new UserModel();
		user.setUsername(request.getParameter("username"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		user.setContact(request.getParameter("contact"));
		user.setAddress(request.getParameter("address"));
		user.setZipcode(request.getParameter("zipcode"));
		
	String response =  userService.userRegister(user);
		model.addAttribute("message", response);
		return "success";
	}
	
	//Login Form....
	@GetMapping("/login")
	public String disLoginForm(Model model) {
		model.addAttribute("user", new UserModel());
		
		return "login";
	}
	
	@PostMapping("user/login")
	public String userLogin(HttpServletRequest request, Model model) {
		//TODO: process POST request
		UserModel user = new UserModel();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		
		String response = userService.validateUser("username", "password");
		model.addAttribute("message", response);
		return "success";
		
	}
	

}
