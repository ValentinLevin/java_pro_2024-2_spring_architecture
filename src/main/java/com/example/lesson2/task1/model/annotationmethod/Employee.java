package com.example.lesson2.task1.model.annotationmethod;

import org.springframework.stereotype.Component;

@Component("employeeByAnnotation")
public class Employee {
    private final String creationMethod;
    private String name;
    private int age;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCreationMethod() {
        return creationMethod;
    }

    public Employee() {
        this("annotation");
    }

    public Employee(String creationMethod) {
        this.creationMethod = creationMethod;
    }
}
