package com.example.lesson2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("employeeByAnnotation")
@ToString
@Getter
@Setter
public class Employee {
    @JsonIgnore
    private final String creationMethod;

    private String name;
    private int age;
    private String department;

    public Employee() {
        this("createdByAnnotation");
    }

    public Employee(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    public Employee(
            String creationMethod,
            String name,
            int age,
            String department
    ) {
        this(creationMethod);
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public Employee(
            String name,
            int age,
            String department
    ) {
        this("");
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
