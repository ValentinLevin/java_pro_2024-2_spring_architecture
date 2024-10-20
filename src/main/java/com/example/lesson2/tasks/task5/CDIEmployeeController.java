package com.example.lesson2.tasks.task5;

import com.example.lesson2.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cdi")
public class CDIEmployeeController {
    private final EmployeeService employeeService;

    public CDIEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public Employee getEmployee() {
        return employeeService.getEmployeeForCDI();
    }
}
