package com.sheldon.jpaspecificationqueryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.sheldon.jpaspecificationqueryproject.repository")
@EntityScan("com.sheldon.jpaspecificationqueryproject.repository.entity")
@SpringBootApplication
public class JpaSpecificationQueryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSpecificationQueryProjectApplication.class, args);
	}

}
