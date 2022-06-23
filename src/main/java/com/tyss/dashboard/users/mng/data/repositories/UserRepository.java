package com.tyss.dashboard.users.mng.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tyss.dashboard.users.mng.entities.UserEntity;

@Repository("UserRepository")
public interface UserRepository extends MongoRepository<UserEntity, String> {

	public boolean existsByEmail(String email);

	public boolean existsByName(String name);

	public boolean existsByPhone(String phone);

	public UserEntity findByEmail(String email);

	public UserEntity findByName(String trainerName);

	public UserEntity findByPhone(String phone);
}
