package com.cozentus.SpringBootJPA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cozentus.SpringBootJPA.User.User;
import com.cozentus.SpringBootJPA.repository.UserRepository;



@RestController
public class UserController {
	
	@Autowired

	private UserService userservice;

	@Autowired

	private UserRepository userrepo;

	

    @GetMapping("allemployee")

    public List<User> getAll(){

		List<User> UserList = userservice.GetAll();

		return UserList;

	}

    @PostMapping("allemployee")

	public User PostUser(@RequestBody User user ) {

		

		User saveUser = userservice.addUser(user);

		userrepo.save(saveUser);

		return saveUser;

	}

    @PutMapping("allemployee/{id}")

	public User PutUser(@RequestBody User user , @PathVariable int id) {

		User usersave =  userservice.updateUser(user, id);

		Optional<User> user1 = userrepo.findById(id);

		User userobject = user1.get();

		userobject.setName(usersave.getName());

		userobject.setCity(usersave.getCity());

		userobject.setPassword(usersave.getPassword());

		userobject.setStatus(usersave.getStatus());

		userrepo.save(userobject);

		return userobject;

	}

	

	

}