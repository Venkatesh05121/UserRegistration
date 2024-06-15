package com.demo.springboot.mvc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.springboot.mvc.app.entity.UserInformation;

@Repository
public interface UserRepository extends JpaRepository<UserInformation, Integer> {

	public UserInformation findByEmail(String email);
	public UserInformation findByUsernameAndPassword(String username, String password);
}
