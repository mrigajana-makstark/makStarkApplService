package com.example.MSworkspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MSworkspaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MSworkspaceApplication.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/api/greet")
    public String greet() {
        return "Hello from Java Backend!";
    }
}

//MSworkspaceApplication