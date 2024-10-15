package com.example.lesson2.task1.model.annotationmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired()
    @Qualifier("employeeByAnnotation")
    private Employee employeeByAnnotation;

    private final Employee employeeByJava;

    public EmployeeService(
            @Qualifier("employeeByJava") Employee employeeByJava
    ) {
        this.employeeByJava = employeeByJava;
    }

    public void printEmployees() {

    }
}
