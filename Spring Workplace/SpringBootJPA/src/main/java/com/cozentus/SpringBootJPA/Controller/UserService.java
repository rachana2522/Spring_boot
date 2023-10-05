package com.cozentus.SpringBootJPA.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cozentus.SpringBootJPA.User.User;
import com.cozentus.SpringBootJPA.repository.UserRepository;




@Component
public class UserService {
	
	@Autowired

	UserRepository userRepository;

	

	

 

	

	public List<User> GetAll(){

		Iterable<User> iterable =  userRepository.findAll();

		List<User> list = new ArrayList<>();

		for(User element:iterable) {

			list.add(element);

		}

		return list;

	}

	private static List<User> users = new ArrayList<>();

	

	public User addUser(User user) {

 

		users.add(user);

		

		return user;

		

	 }
	

public User updateUser(User user, int id) {

	List<User> list1 = GetAll();

		if(user.getId()!=null) {

			list1.set(id-1,user);

		}

		return user;

	}

	

	

	

	

}

 