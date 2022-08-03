package com.kgh.membership;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MembershipApplication {
	private static Logger logger = LogManager.getLogger(MembershipApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MembershipApplication.class, args);
		logger.info("info = {}", "info Test");
		logger.debug("debug = {}", "debug Test");
		logger.warn("warn = {}", "warn Test");
		logger.error("error = {}", "error Test");
	}

}
