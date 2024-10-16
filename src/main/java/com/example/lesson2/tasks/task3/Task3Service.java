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
            @Qualifier("task3StaticValues") SomeModel modelWithStaticValues,
            @Qualifier("task3ExpressionValues") SomeModel modelWithExpressionValues,
            @Qualifier("task3SystemProperties1") SomeModel modelWithSystemPropertiesValues1,
            @Qualifier("task3SystemProperties2") SomeModel modelWithSystemPropertiesValues2,
            @Qualifier("task3ExistingBean") SomeModel modelWithValuesFromExistingBean,
            @Qualifier("task3ClassStaticValues") SomeModel modelWithValuesFromStaticProperties,
            @Qualifier("task3FromObjectValues") SomeModel modelWithValuesFromObjectProperties,
            @Qualifier("task3ElvisValues") SomeModel modelWithValuesUsingElvis,
            @Qualifier("task3SafeNavigation") SomeModel modelWithValuesUsingSafeNavigation,
            @Qualifier("task3Collections") SomeModel modelWithValuesUsingCollections
    ) {
        models.add(modelWithStaticValues);
        models.add(modelWithExpressionValues);
        models.add(modelWithSystemPropertiesValues1);
        models.add(modelWithSystemPropertiesValues2);
        models.add(modelWithValuesFromExistingBean);
        models.add(modelWithValuesFromStaticProperties);
        models.add(modelWithValuesFromObjectProperties);
        models.add(modelWithValuesUsingElvis);
        models.add(modelWithValuesUsingSafeNavigation);
        models.add(modelWithValuesUsingCollections);
    }

    public void printModels() {
        log.info("");
        log.info("task3 ------------------ start");
        models.forEach(model -> log.info("task3. {}", model));
        log.info("task3 ------------------ finish");
    }
}
