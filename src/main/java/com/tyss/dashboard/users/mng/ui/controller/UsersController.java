package com.tyss.dashboard.users.mng.ui.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.dashboard.users.mng.entities.UserEntity;
import com.tyss.dashboard.users.mng.model.LoginRequestModel;
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

	@PostMapping("add/user")
	public ResponseEntity<String> createUser(@RequestBody UserDto addTrainerRequestModel) {

		System.out.println("UsersController : createUser() executed");
		return userManagementServiceImpl.addUser(mapper.map(addTrainerRequestModel, UserEntity.class));
	}

	@GetMapping
	public String status() {

		return "UsersController working";
	}

	@PostMapping("login")
	public String login(@RequestParam String phone) {

		return "login details";
	}
	
	@PostMapping("update/user")
	public ResponseEntity<String> updateUser(@RequestBody UserEntity userEntity) {

		System.out.println("UsersController : updateUser() executed");
		return userManagementServiceImpl.editUser(userEntity);
	}

	@GetMapping("get/user")
	public ResponseEntity<UserEntity> viewUser(@RequestParam String phone) {

		System.out.println("UsersController : viewUser() executed");
		return userManagementServiceImpl.viewUser(phone);
	}
	
	@GetMapping("get/all/users")
	public ResponseEntity<List<UserEntity>> viewAllUsers() {

		return userManagementServiceImpl.viewAllUsers();
	}
	
	@PostMapping("delete/user")
	public ResponseEntity<String> deleteUser(@RequestBody LoginRequestModel loginRequestModel) {

		return userManagementServiceImpl.deleteUser(loginRequestModel);
	}

}
