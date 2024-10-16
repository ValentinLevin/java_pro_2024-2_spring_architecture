package com.example.lesson2.tasks.task2;

import com.example.lesson2.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service()
@Slf4j
@PropertySource("classpath:employee-spel.properties")
public class EmployeeServiceTask2 {
    private final Employee employeeWithDataFromSpEL;
    private final Employee employeeWithDataFromEnvironment;

    public EmployeeServiceTask2(
            @Value("${employee.spel.name}") String name,
            @Value("${employee.spel.age}") int age,
            @Value("${employee.spel.department}") String department,
            Environment env
    ) {
        this.employeeWithDataFromEnvironment = assignValuesFromEnvironment(env);
        this.employeeWithDataFromSpEL = new Employee("byMySelf", name, age, department);
    }

    private Employee assignValuesFromEnvironment(Environment env) {
        Employee employee = new Employee("byMySelf");

        String name = env.getProperty("employee.env.name");
        int age = env.getProperty("employee.env.age", Integer.class);
        String department = env.getProperty("employee.env.department");

        employee.setName(name);
        employee.setAge(age);
        employee.setDepartment(department);

        return employee;
    }

    public void printEmployees() {
        log.info("task2 ------------------------");
        log.info("task2. Employee with data loaded from environment {}", this.employeeWithDataFromEnvironment);
        log.info("task2. Employee with data loaded from SpEL values {}", this.employeeWithDataFromSpEL);
        log.info("task2 ------------------------");
    }
}
