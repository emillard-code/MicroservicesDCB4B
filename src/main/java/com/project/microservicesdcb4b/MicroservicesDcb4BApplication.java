package com.project.microservicesdcb4b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroservicesDcb4BApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroservicesDcb4BApplication.class, args);

    }

}
