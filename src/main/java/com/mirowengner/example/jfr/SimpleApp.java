package com.mirowengner.example.jfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple Spring Boot application with enabled opentracing and delegating to JFR
 *
 * @author Miroslav Wengner (@miragemiko)
 */
@SpringBootApplication
@RestController
public class SimpleApp {

    public static void main(String[] args) {
        SpringApplication.run(SimpleApp.class, args);
    }

    @GetMapping("/jfr")
    public String hello() {
        return "hello jfr";
    }
}
