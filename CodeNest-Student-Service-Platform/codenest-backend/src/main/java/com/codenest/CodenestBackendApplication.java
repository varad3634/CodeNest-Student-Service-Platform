package com.codenest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodenestBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodenestBackendApplication.class, args);
        System.out.println("✅ CodeNest Backend is running on http://localhost:8080");
    }
}
