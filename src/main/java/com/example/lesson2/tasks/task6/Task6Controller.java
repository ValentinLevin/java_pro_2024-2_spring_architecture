package com.example.lesson2.tasks.task6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Task6Controller {
    private final Task6Service task6Service;

    public Task6Controller(Task6Service task6Service) {
        this.task6Service = task6Service;
    }

    @GetMapping("/getRandomNumber")
    public int getRandomNumber() {
        return this.task6Service.getRandomNumber();
    }
}
