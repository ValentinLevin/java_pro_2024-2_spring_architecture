package com.example.lesson2.tasks.task2;

import lombok.Getter;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

@Getter
@ToString
public class MyApplicationEvent extends ApplicationEvent {
    private final String message;

    public MyApplicationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
