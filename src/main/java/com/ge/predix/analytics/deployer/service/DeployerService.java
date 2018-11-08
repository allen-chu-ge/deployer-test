package com.ge.predix.analytics.deployer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeployerService {

	static Logger logger = LoggerFactory.getLogger(DeployerService.class);

	@RequestMapping(path = "/health", method = RequestMethod.GET)
	public ResponseEntity healthcheck() {
		logger.info("Successful call to healthcheck");
		return ResponseEntity.ok().build();
	}

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> helloWorld() {
		logger.info("Hello World!");
		return ResponseEntity.ok("Hello World!");
	}
}
