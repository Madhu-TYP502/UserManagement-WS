package com.tyss.dashboard.users.mng.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tyss.dashboard.users.mng.entities.UserEntity;
import com.tyss.dashboard.users.mng.model.LoginRequestModel;

public interface UserManagementServices<T> {

	public ResponseEntity<UserEntity> viewUser(String userName);
	
	public ResponseEntity<List<UserEntity>> viewAllUsers();

	public ResponseEntity<String> addUser(UserEntity userEntity);

	public ResponseEntity<String> editUser(UserEntity userEntity);

	public ResponseEntity<String> deleteUser(LoginRequestModel loginRequestModel);

}
