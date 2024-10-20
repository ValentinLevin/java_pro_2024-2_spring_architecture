package com.example.lesson2.tasks.task2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventPublishService {
    private final ApplicationEventPublisher applicationEventPublisher;

    public EventPublishService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent(final String message) {
        MyApplicationEvent myApplicationEvent = new MyApplicationEvent(this, message);

        log.info("task2. Sent message: {}", message);

        applicationEventPublisher.publishEvent(myApplicationEvent);
    }
}
