package com.example.lesson2.tasks.task3;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class SomeModel {
    private final String name;
    private final String stringValue;
    private final int numberValue;
    private final boolean booleanValue;

    public SomeModel(
            String name,
            String stringValue,
            int numberValue,
            boolean booleanValue
    ) {
        this.name = name;
        this.stringValue = stringValue;
        this.numberValue = numberValue;
        this.booleanValue = booleanValue;
    }
}
