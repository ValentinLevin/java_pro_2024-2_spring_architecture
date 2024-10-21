package com.example.lesson2.tasks.task3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
@Slf4j
public class Task3Service {
    private final Collection<SomeModel> models = new ArrayList<>();

    public Task3Service(
            @Qualifier("task3.staticValues") SomeModel modelWithStaticValues,
            @Qualifier("task3.expressionValues") SomeModel modelWithExpressionValues
    ) {
        models.add(modelWithStaticValues);
        models.add(modelWithExpressionValues);
    }

    public void printModels() {
        log.info("task3 ------------------ start");
        models.forEach(model -> log.info("task3. {}", model));
        log.info("task3 ------------------ finish");
    }
}
