package ma.emsi.iFoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ma.emsi.iFoot.model.User;
import ma.emsi.iFoot.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users=userService.getUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") int id){
		User user=userService.getUser(id);
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User u){
		User user=userService.createUser(u);
		return new ResponseEntity<>(user,HttpStatus.CREATED);
	}
}
