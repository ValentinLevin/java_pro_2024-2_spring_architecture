package com.example.lesson2.tasks.task5;

import com.example.lesson2.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final Employee employeeForSDI;
    private final Employee employeeForCDI;

    public EmployeeService() {
        this.employeeForSDI = new Employee("Employee for SDI", 0, "");
        this.employeeForCDI = new Employee("Employee for CDI", 0, "");
    }

    public Employee getEmployeeForSDI() {
        return this.employeeForSDI;
    }

    public Employee getEmployeeForCDI() {
        return this.employeeForCDI;
    }
}
