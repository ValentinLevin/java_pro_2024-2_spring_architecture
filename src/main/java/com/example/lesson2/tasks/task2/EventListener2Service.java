package com.example.lesson2.tasks.task2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventListener2Service {
    @EventListener()
    @Async
    public void onApplicationEvent(MyApplicationEvent event) {
        log.info("Task2. Received message in listener 2: {}", event.getMessage());
    }
}
