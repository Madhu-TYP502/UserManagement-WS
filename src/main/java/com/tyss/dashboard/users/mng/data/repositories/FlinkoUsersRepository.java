package com.tyss.dashboard.users.mng.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tyss.dashboard.users.mng.entities.FlinkoUserEntity;

public interface FlinkoUsersRepository extends MongoRepository<FlinkoUserEntity,String> {

}
