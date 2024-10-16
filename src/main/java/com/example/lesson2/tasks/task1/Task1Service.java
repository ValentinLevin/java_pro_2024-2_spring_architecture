package com.example.lesson2.tasks.task1;

import com.example.lesson2.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Task1Service {
    private final Employee employeeByAnnotation;
    private final Employee employeeByJava;
    private final Employee employeeByXml;

    public Task1Service(
            @Qualifier("employeeByAnnotation") Employee employeeByAnnotation,
            @Qualifier("employeeByJava") Employee employeeByJava,
            @Qualifier("employeeByXml") Employee employeeByXml
    ) {
        this.employeeByAnnotation = employeeByAnnotation;
        this.employeeByJava = employeeByJava;
        this.employeeByXml = employeeByXml;
    }

    public void printEmployees() {
        log.info("");
        log.info("task1 ------------------------");
        log.info("task1. Employee created using an annotation: {}", this.employeeByAnnotation);
        log.info("task1. Employee created using an java code: {}", this.employeeByJava);
        log.info("task1. Employee created using xml configuration: {}", this.employeeByXml);
        log.info("task1 ------------------------");
    }
}
