package com.TrainReservation.User.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrainReservation.User.Repository.UserRepository;
import com.TrainReservation.User.model.User;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUsers()
	{
	List<User> users=new ArrayList<>();
	userRepository.findAll().forEach(users::add);
	return users;
	}
	
	
	public void add(User user) 
	{
		userRepository.save(user);
	}
	
	public void update(User user)
	{
	userRepository.save(user);
	}
	
	public void delete(String userid) {
		userRepository.deleteById(userid);
	}
	
	public Optional<User>getUser(String userid){
		return null;
		
	}

}
