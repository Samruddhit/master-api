package com.service;

import java.util.List;

import com.example.model.User;
import com.exceptions.UserAlready_Exists_Excp;
import com.exceptions.UserNotFoundExp;


public interface IUserService {
	List<User> findAllUsers();

	User findUserById(long id) throws UserNotFoundExp;

	User findUserByEmail(String email) throws UserNotFoundExp;

	User createUser(User user) throws UserAlready_Exists_Excp;

	User updateUser(String id, User user) throws UserNotFoundExp;

	void deleteUser(String id) throws UserNotFoundExp;

	User findUserById1(long id) throws UserNotFoundExp;
}
