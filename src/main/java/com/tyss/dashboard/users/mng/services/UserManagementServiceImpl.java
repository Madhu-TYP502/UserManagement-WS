package com.tyss.dashboard.users.mng.services;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.dashboard.users.mng.data.repositories.BatchRepository;
import com.tyss.dashboard.users.mng.data.repositories.UserRepository;
import com.tyss.dashboard.users.mng.entities.UserEntity;

@Service
public class UserManagementServiceImpl implements UserManagementServices<Object> {

	@Autowired
	UserRepository userRepository;

	@Autowired
	BatchRepository batchRepository;

	@Autowired
	MongoTemplate mongoTemplate;

	Logger logger = LoggerFactory.getLogger(UserManagementServiceImpl.class);

	@Override
	public ResponseEntity<String> addUser(UserEntity userEntity) {

		if (mongoTemplate
				.find(new Query().addCriteria(Criteria.where("email").is(userEntity.getEmail())), UserEntity.class)
				.size() == 0
				&& (mongoTemplate.find(new Query().addCriteria(Criteria.where("phone").is(userEntity.getPhone())),
						UserEntity.class).size() == 0)) {

			userEntity.setName(userEntity.getName().toLowerCase());
			userEntity.setEmail(userEntity.getEmail().toLowerCase());

			userEntity.setId(UUID.randomUUID().toString());

			userEntity.setStatus("PENDING");

			userRepository.save(userEntity);

			return ResponseEntity.status(HttpStatus.ACCEPTED).body(userEntity.getRole() + " added susccesfully!!");

		}
		return ResponseEntity.status(HttpStatus.CONFLICT)
				.body(("Trainer with the given email or mobile number already exists!!!"));
	}

	@Override
	public ResponseEntity<String> editUser(UserEntity userEntity,String uid) {

		if (userRepository.existsById(uid)) {
			
			userRepository.save(userEntity);

			return ResponseEntity.status(HttpStatus.ACCEPTED)
					.body(userEntity.getRole() + " data updated susccesfully!!");
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body(userEntity.getRole() + " with the ID do not exists!!!");
	}

	@Override
	public ResponseEntity<String> deleteUser(String uid) {

		logger.info("DELETE USER");
		
	    System.out.println("DELETING : "+uid);

		UserEntity userEntity = userRepository.findById(uid).get();

		if (userEntity != null) {
			userRepository.delete(userEntity);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Trainer data deleted susccesfully!!");
		}

		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body("Trainer do not exists!!!");
	}

	@Override
	public ResponseEntity<UserEntity> viewUser(String phone) {

		System.out.println("finding user : " + phone);
		UserEntity user = userRepository.findByPhone(phone);

		if (user != null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(user);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

	@Override
	public ResponseEntity<List<UserEntity>> viewAllUsers() {
		List<UserEntity> userEntities = userRepository.findAll();

		if (userEntities != null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(userEntities);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userEntities);
	}

}
