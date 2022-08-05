package com.TrainReservation.User.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TrainReservation.User.model.User;
import com.TrainReservation.User.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	
	private UserService userservice;
	
	@RequestMapping("/user/{userid}")
	public Optional<User>getUser(@PathVariable("userid") String userid)
	{
		
		return userservice.getUser(userid);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/user")
	public List<User> getAllUsers()
	{
		return userservice.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public User adduser(@RequestBody User user)
	{
	  userservice.add(user);
	  return user;
	
	}
	
   @RequestMapping(method=RequestMethod.PUT,value="/user/update/{userid}")
   public User updateUser(@RequestBody User user,@PathVariable("userid")String userid) {
	   user.setUserid(userid);
	   userservice.update(user);
	   return user;
   }
   @RequestMapping(method=RequestMethod.DELETE,value="user/{userid}")
   public String deleteuserid(@PathVariable String userid) {
	   userservice.delete(userid);
	   return "deleted userid:"+userid;
   }
}
