package com.example.lesson2;

import com.example.lesson2.tasks.task1.EmployeeServiceTask1;
import com.example.lesson2.tasks.task2.EmployeeServiceTask2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lesson2Application {
    public static void main(String[] args) {
        SpringApplication.run(Lesson2Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            EmployeeServiceTask1 employeeServiceTask1,
            EmployeeServiceTask2 employeeServiceTask2
    ) {
        return (String[] args) -> {
            employeeServiceTask1.printEmployees();
            employeeServiceTask2.printEmployees();
        };
    }
}
