package com.tyss.dashboard.users.mng.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.tyss.dashboard.users.mng.entities.FlinkoUserEntity;

@FeignClient(name = "flinko-mock-service", fallbackFactory = FlinkoUsersFallbackFactory.class)
public interface FlinkoUsersConsumer {

	@GetMapping("users/get/all/users")
	public ResponseEntity<List<FlinkoUserEntity>> viewAllUsers();

}

@Component
class FlinkoUsersFallbackFactory implements FallbackFactory<FlinkoUsersConsumer> {

	@Override
	public FlinkoUsersConsumer create(Throwable cause) {

		return new FlinkoUsersFallback(cause);
	}

}

class FlinkoUsersFallback implements FlinkoUsersConsumer {

	Logger logger = LoggerFactory.getLogger(FlinkoUsersFallback.class);

	private Throwable cause;

	public FlinkoUsersFallback(Throwable cause) {
		this.cause = cause;
	}

	@Override
	public ResponseEntity<List<FlinkoUserEntity>> viewAllUsers() {

		logger.info(cause.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}

}
