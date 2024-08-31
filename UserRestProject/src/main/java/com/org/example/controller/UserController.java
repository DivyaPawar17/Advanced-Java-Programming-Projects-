package com.org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.example.dto.ErrorResponse;
import com.org.example.entity.User;
import com.org.example.service.UserService;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/add")
	public ResponseEntity<?> registerUser(@RequestBody User user) {
		User createUser = userService.create(user);
		return new ResponseEntity<>(createUser, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllUsers() {
		try {
			return new ResponseEntity<>(userService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			ErrorResponse errRes = new ErrorResponse("user fetching failed", e.getMessage());

			return new ResponseEntity<>(errRes, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping("/getUser/{id}")
	public ResponseEntity<?> fetchUserById(Integer id) {

		try {
			return ResponseEntity.ok(userService.fetchById(id));

		} catch (RuntimeException e) {
			ErrorResponse errRes = new ErrorResponse("Not Found", e.getMessage());
			return new ResponseEntity<>(errRes, HttpStatus.BAD_REQUEST);

		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateUserById(@PathVariable int id, @RequestBody User updateUser){
		try {
			User existingUser = userService.fetchById(id);
			return ResponseEntity.ok(userService.update(existingUser, existingUser));
			
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("User updation failed", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable int id, @RequestBody User deleteUser){
		try {
			User existingUser = userService.fetchById(id);
			return ResponseEntity.ok(userService.delete(existingUser));
			
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("User delete successfully", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getByName/{name}")
	public ResponseEntity<?> getUserName(@PathVariable String name){
		try {
			ResponseEntity res = null;
			User founduser = userService.fetchUserByUserName(name);
			if(founduser != null) {
		return ResponseEntity.ok(founduser);
			}
			return res;
			
		}catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse("Fetching user by username failed", e.getMessage()),HttpStatus.BAD_REQUEST);
		}
	}
}
