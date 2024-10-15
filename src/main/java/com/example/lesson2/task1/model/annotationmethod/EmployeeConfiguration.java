package com.example.lesson2.task1.model.annotationmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {
    @Bean("employeeByJava")
    public Employee getEmployeeByJava() {
        return new Employee();
    }
}
