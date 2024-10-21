package com.example.lesson2;

import com.example.lesson2.tasks.task1.Task1Service;
import com.example.lesson2.tasks.task2.Task2Service;
import com.example.lesson2.tasks.task3.Task3Service;
import com.example.lesson2.tasks.task4.Task4Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Lesson2Application {
    public static void main(String[] args) {
        SpringApplication.run(Lesson2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            Task1Service task1Service,
            Task2Service task2Service,
            Task3Service task3Service,
            Task4Service task4Service
    ) {
        return (String[] args) -> {
            task1Service.printEmployees();
            task2Service.sendMessage();
            task3Service.printModels();
            task4Service.printEmployeesBeanInfo();
        };
    }
}
