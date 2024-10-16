package com.example.lesson2.tasks.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task3Configuration {
    @Bean("task3StaticValues")
    public SomeModel modelStaticValues(
            @Value("#{'static string value'}") String stringValue,
            @Value("#{123}") int numberValue,
            @Value("#{true}") boolean booleanValue
    ) {
        return new SomeModel("model with static values", stringValue, numberValue, booleanValue);
    }

    @Bean("task3ExpressionValues")
    public SomeModel modelExpressionValues(
            @Value("#{'first part expression' + ' - second part expression'}") String stringValue,
            @Value("#{100 + 20 + 3}") int numberValue,
            @Value("#{1 > 10}") boolean booleanValue
    ) {
        return new SomeModel("model with values from expressions", stringValue, numberValue, booleanValue);
    }

    @Bean("task3SystemProperties1")
    public SomeModel systemProperties1(
            @Value("#{systemProperties['user.home']}") String stringValue,
            @Value("#{systemProperties['PID']}") int numberValue,
            @Value("#{systemProperties['user.language'].equals('en')}") boolean booleanValue
    ) {
        return new SomeModel("model with values from system properties (1)", stringValue, numberValue, booleanValue);
    }

    @Bean("task3SystemProperties2")
    public SomeModel systemProperties2(
            @Value("#{systemProperties['user.country']}") String stringValue,
            @Value("#{systemProperties['java.specification.version'].length}") int numberValue,
            @Value("#{systemProperties['file.separator'].equals('//')}") boolean booleanValue
    ) {
        return new SomeModel("model with values from system properties (2)", stringValue, numberValue, booleanValue);
    }

    @Bean("task3ExistingBean")
    public SomeModel fromExistingBean(
            @Value("#{task3ExpressionValues.getName()}") String usedBeanName,
            @Value("#{task3ExpressionValues.getStringValue()}") String stringValue,
            @Value("#{task3ExpressionValues.getNumberValue() * 10 + 5}") int numberValue,
            @Value("#{!task3ExpressionValues.isBooleanValue()}") boolean booleanValue
    ) {
        return new SomeModel(
                String.format("model with values from existing bean with name \"%s\"", usedBeanName),
                stringValue,
                numberValue,
                booleanValue
        );
    }

    @Bean("task3ClassStaticValues")
    public SomeModel fromClassStaticValues(
            @Value("#{T(String).getName()}") String stringValue,
            @Value("#{T(Integer).MAX_VALUE}") int numberValue,
            @Value("#{T(Boolean).FALSE}") boolean booleanValue
    ) {
        return new SomeModel(
                "model with values from static properties of classes",
                stringValue,
                numberValue,
                booleanValue
        );
    }

    @Bean("task3FromObjectValues")
    public SomeModel fromObjectValues(
            @Value("#{new java.util.ArrayList(T(java.util.Arrays).asList('1', 'String value', '3')).get(1)}") String stringValue,
            @Value("#{new String('stringValue').length}") int numberValue,
            @Value("#{new String('stringValue').length == 11}") boolean booleanValue
    ) {
        return new SomeModel(
                "model with values from object properties",
                stringValue,
                numberValue,
                booleanValue
        );
    }

    @Bean("task3ElvisValues")
    public SomeModel fromElvisValues(
            @Value("#{null?:'string value'}") String stringValue,
            @Value("#{null?:'542'}") int numberValue,
            @Value("#{null?:false}") boolean booleanValue
    ) {
        return new SomeModel(
                "model with values received using elvis operator",
                stringValue,
                numberValue,
                booleanValue
        );
    }

    @Bean("nullObject")
    public SomeModel getNullObject() {
        return new SomeModel("", null, 0, false);
    }

    @Bean("task3SafeNavigation")
    public SomeModel usingSafeOperator(
            @Value("#{nullObject.getStringValue()?.length ?: 'string value'}") String stringValue,
            @Value("#{nullObject.getStringValue()?.length ?: 0}") int numberValue,
            @Value("#{nullObject.getStringValue()?.length ?: true}") boolean booleanValue
    ) {
        return new SomeModel(
                "model with values received using safe navigation",
                stringValue,
                numberValue,
                booleanValue
        );
    }

    @Bean("task3Collections")
    public SomeModel fromCollections(
            @Value("#{{'1','2','3'}.?[#this == '1']}") String stringValue,
            @Value("#{{1,2,3}.?[#this == 2]}") int numberValue,
            @Value("#{{1,2,3}.?[#this == 3] == 3}") boolean booleanValue
    ) {
         return new SomeModel(
                "model with values from collections",
                stringValue,
                numberValue,
                booleanValue
        );
    }
}
