package com.reposit;

import java.util.List;

import com.example.model.User;



public interface IUserRepo {
	public List<User> findAllUsers ();
	public User findUserById(String id);
	public User findUserByEmail(String email);
	public User createUser(User user);
	public User updateUser(User user);
	public void deleteUser(User user);
	public User updateContact(User user);
}
