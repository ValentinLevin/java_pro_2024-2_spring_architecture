package com.example.lesson2.tasks.task1;

import com.example.lesson2.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:beans.xml")
public class EmployeeConfiguration {
    @Bean("employeeByJava")
    public Employee getEmployeeByJava() {
        return new Employee("createdByJava");
    }
}
