package com.tyss.dashboard.users.mng.data.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tyss.dashboard.users.mng.entities.BatchEntity;

@Repository("BatchRepository")
public interface BatchRepository extends MongoRepository<BatchEntity, String> {

	public boolean existsByBatchCode(String batchChode);

	public BatchEntity findByBatchCode(String batchChode);

	public List<BatchEntity> findAllByTrainerID(String trainerID);
}
