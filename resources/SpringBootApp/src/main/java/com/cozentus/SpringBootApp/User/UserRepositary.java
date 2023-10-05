package com.cozentus.SpringBootApp.User;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRepositary {
	
	@Autowired
	private UserService userService;
		
	@GetMapping("/all/users")
	public List<User> getAllusers(){
	   List<User> users=userService.findAll();
	return users;
	   
//		if(users.size()<10) {
//			return ResponseEntity.status(HttpStatus.ACCEPTED).build();
//		}
//		else {
//			return ResponseEntity.status(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED).build();
//		}
	
	
}
	
   @GetMapping("/{id}/users")
	public User getUserById(@PathVariable int id){
	   User user=userService.findUserById(id);
	return user;
}
   
   
   
   @PostMapping("/users")
	public User postUserData(@RequestBody User user){
	   
	   User saveUser = userService.addUser(user);
	   return saveUser;
	  
}
   
   
   
}
