package com.cozentus.SpringBootApp.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {
	
	
	private static List<User> users = new ArrayList<>();
	
	private static int temp=6;
	
	static {
		users.add(new User(1, "Rachna", "rachana@123",new Date()));
		users.add(new User(2, "chna", "rachana3",new Date()));
		users.add(new User(3, "Dilipa", "ra123",new Date()));
		users.add(new User(4, "Kukur", "hana@123",new Date()));
		users.add(new User(5, "Bishak", "ra@123",new Date()));
		users.add(new User(6, "chnak", "rach123",new Date()));
	}

	

	public List<User> findAll() {
		return users;
	}
	
	
	public User findUserById(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
		
	}
	public User addUser(User user) {
		if(user.getId()==null) {
			user.setId(++temp);
		}
		users.add(user);
		return user;
		
	}

}
