package com.tyss.dashboard.users.mng.ui.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.dashboard.users.mng.entities.UserEntity;
import com.tyss.dashboard.users.mng.model.UserDto;
import com.tyss.dashboard.users.mng.services.UserManagementServiceImpl;

@RestController
@RequestMapping("users/")
public class UsersController {

	@Autowired
	UserManagementServiceImpl userManagementServiceImpl;

	ModelMapper mapper;

	{
		mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	}

	@PostMapping("add")
	public ResponseEntity<String> createUser(@RequestBody UserDto addTrainerRequestModel) {

		return userManagementServiceImpl.addUser(mapper.map(addTrainerRequestModel, UserEntity.class));
	}

	@GetMapping
	public String status() {

		return "UsersController working";
	}
	
	@PutMapping("update")
	public ResponseEntity<String> updateUser(@RequestBody UserEntity userEntity,@RequestParam String uid) {

		System.out.println("UsersController : updateUser() executed");
		return userManagementServiceImpl.editUser(userEntity,uid);
	}

	@GetMapping("get")
	public ResponseEntity<UserEntity> viewUser(@RequestParam String phone) {

		System.out.println("UsersController : viewUser() executed");
		return userManagementServiceImpl.viewUser(phone);
	}
	
	@GetMapping("get/all")
	public ResponseEntity<List<UserEntity>> viewAllUsers() {

		return userManagementServiceImpl.viewAllUsers();
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<String> deleteUser(@RequestParam String uid){

		return userManagementServiceImpl.deleteUser(uid);
	}

}
