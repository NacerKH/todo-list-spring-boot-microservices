package com.example.taskmanagementms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient

public class TaskmanagementMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskmanagementMsApplication.class, args);
    }

}
