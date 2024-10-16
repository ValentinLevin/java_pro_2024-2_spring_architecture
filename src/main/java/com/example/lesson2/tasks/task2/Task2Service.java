package com.example.lesson2.tasks.task2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Task2Service {
    private final EventPublishService eventPublisherService;

    public Task2Service(EventPublishService eventPublishService) {
        this.eventPublisherService = eventPublishService;
    }

    public void sendMessage() {
        log.info("");

        eventPublisherService.publishEvent("Test Message");

        /* Время для отработки сообщения в слушателях, чтобы не перемешались с сообщениями других заданий в консоли */
        try {
            Thread.currentThread().sleep(500);
        } catch (InterruptedException ignored) {

        }
    }
}
