package com.demo.springboot.mvc.app.dto;

public class UserModel {
	
	private String username;
	private String email;
	private String password;
	private String contact;
	private String address;
	private String zipcode;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "UserModel [username=" + username + ", email=" + email + ", password=" + password + ", contact="
				+ contact + ", address=" + address + ", zipcode=" + zipcode + "]";
	}
	
	

}
