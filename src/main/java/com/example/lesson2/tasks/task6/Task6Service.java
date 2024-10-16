package com.example.lesson2.tasks.task6;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Task6Service {
    private final LazyInitComponent lazyInitComponent;

    public Task6Service(
            /*
            * Указание для Spring не загружать в контекст при запуске приложения. Возвращается Proxy.
            * При первом вызове любого метода проксируемого объекта Spring создаст экземпляр класса (Employee) и
            * передаст запрос для отработки ему
            *  */
            @Lazy LazyInitComponent lazyInitComponent
    ) {
        this.lazyInitComponent = lazyInitComponent;
    }

    public int getRandomNumber() {
        log.info("");
        log.info("task6---------------------------");

        int randomValue = this.lazyInitComponent.generateRandomNumber();

        log.info("task6--------------------------");

        return randomValue;
    }
}
