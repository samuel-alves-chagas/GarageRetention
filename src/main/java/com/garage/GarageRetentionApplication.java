package com.garage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.garage")
@EnableJpaRepositories(basePackages = "com.garage")
public class GarageRetentionApplication {

    public static void main(String[] args) {
            SpringApplication.run(GarageRetentionApplication.class, args);

    }
}