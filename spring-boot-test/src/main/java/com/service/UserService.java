package com.service;

import java.util.List;

import com.example.model.User;
import com.exceptions.UserAlready_Exists_Excp;
import com.exceptions.UserNotFoundExp;
import com.reposit.UserRepo;

public class UserService implements IUserService {
UserRepo dao;

//Now start writing the dao logic for respective 
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public User findUserById(long Id) throws UserNotFoundExp {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByEmail(String email) throws UserNotFoundExp {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) throws UserAlready_Exists_Excp {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(String id, User user) throws UserNotFoundExp {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String id) throws UserNotFoundExp {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findUserById1(long id) throws UserNotFoundExp {
		// TODO Auto-generated method stub
		return null;
	}

}
