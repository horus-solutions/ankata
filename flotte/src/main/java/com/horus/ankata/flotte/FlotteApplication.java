package com.horus.ankata.flotte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.horus.ankata"})
@EntityScan(basePackages = {"com.horus.ankata"})
@ComponentScan(basePackages = {"com.horus.ankata"})
public class FlotteApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlotteApplication.class, args);
    }
}
