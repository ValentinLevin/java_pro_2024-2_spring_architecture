package com.example.lesson2.tasks.task6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Lazy /* Указание для Spring не загружать в контекст при запуске приложения */
@Slf4j
public class LazyInitComponent {
    private static final int RANDOM_FROM_VALUE = 1;
    private static final int RANDOM_TO_VALUE = 100;

    private final Random randomGenerator;

    public LazyInitComponent() {
        log.info("task6. Lazy component creation");
        this.randomGenerator = new Random();
    }

    public int generateRandomNumber() {
        int randomValue = randomGenerator.nextInt(RANDOM_TO_VALUE - RANDOM_FROM_VALUE + 1) + RANDOM_FROM_VALUE;
        log.info("task6. Generated random value: {}", randomValue);
        return randomValue;
    }
}
