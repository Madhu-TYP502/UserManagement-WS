package com.tyss.dashboard.users.mng.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.tyss.dashboard.users.mng.entities.UserEntity;

public interface UserManagementServices<T> {

	public ResponseEntity<UserEntity> viewUser(String userName);
	
	public ResponseEntity<List<UserEntity>> viewAllUsers();

	public ResponseEntity<String> addUser(UserEntity userEntity);

	public ResponseEntity<String> editUser(UserEntity userEntity,String uid);

	public ResponseEntity<String> deleteUser(String uid);

}
