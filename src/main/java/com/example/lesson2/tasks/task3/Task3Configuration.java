package com.example.lesson2.tasks.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task3Configuration {
    @Bean("task3.staticValues")
    public SomeModel modelStaticValues(
            @Value("#{'static string value'}") String stringValue,
            @Value("#{123}") int numberValue,
            @Value("#{true}") boolean booleanValue
    ) {
        return new SomeModel("model with static values", stringValue, numberValue, booleanValue);
    }

    @Bean("task3.expressionValues")
    public SomeModel modelExpressionValues(
            @Value("#{'first part expression' + ' - second part expression'}") String stringValue,
            @Value("#{100 + 20 + 3}") int numberValue,
            @Value("#{1 > 10}") boolean booleanValue
    ) {
        return new SomeModel("model with values from expressions", stringValue, numberValue, booleanValue);
    }

    @Bean("task3.systemProperties")
    public SomeModel systemProperties() {
        return
    }
}
