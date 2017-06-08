package com.demo.mavendemoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sridhar on 07-06-2017.
 */
@SpringBootApplication
@RestController
public class MavenDemoApplication {

@GetMapping("/")
    public String sayHello(){
    return "Welcome";
}


    public static void main(String[] args) {
        SpringApplication.run(MavenDemoApplication
                .class, args);
    }
}


