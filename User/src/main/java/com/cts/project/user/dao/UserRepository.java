package com.cts.project.user.dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cts.project.user.pojo.User;

public interface UserRepository extends CrudRepository<User, String> {

	
	User findByUsernameAndPasswordAndConfirm(String username,String password, String confirm);

	Optional<User> findByEmail(String email);
}
