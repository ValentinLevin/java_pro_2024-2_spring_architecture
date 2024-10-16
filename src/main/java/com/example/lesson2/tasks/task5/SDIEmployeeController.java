package com.example.lesson2.tasks.task5;

import com.example.lesson2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdi")
public class SDIEmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public Employee getEmployee() {
        return employeeService.getEmployeeForSDI();
    }
}
