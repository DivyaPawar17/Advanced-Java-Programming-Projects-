package com.org.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.example.custom_exception.UserNotFoundException;
import com.org.example.dao.UserRepo;
import com.org.example.entity.User;
@Service
public class UserService implements CrudService<User, Integer> {
	@Autowired
	private UserRepo userRepo;

	@Override
	public User create(User user) {
		User createdUser = userRepo.save(user);
		return userRepo.save(user);
	}

	@Override
	public User created(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> fetchAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User fetchById(Integer id) {
		return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException("Invalid id"));
		
	}

	@Override
	public User update(User updatedUser, User existingUser) {
		existingUser.setUserName(updatedUser.getUserName());
		existingUser.setPassword(updatedUser.getUserName());
		return userRepo.save(existingUser);
	}

	@Override
		public String delete(User user) {
			userRepo.delete(user);
			return user.getId()+ "deleted";
		}
	
	public User fetchUserByUserName(String name) {
		return userRepo.findByUserName(name);
	}

	
	

	

	
}
