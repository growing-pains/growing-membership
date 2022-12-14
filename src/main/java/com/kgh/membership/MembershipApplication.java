package com.kgh.membership;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.EntityListeners;

@SpringBootApplication
@EntityListeners(AuditingEntityListener.class)
@EnableJpaAuditing
public class MembershipApplication {
	private static Logger logger = LogManager.getLogger(MembershipApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(MembershipApplication.class, args);
		logger.info("info = {}", MembershipApplication.class);
	}
}
