package com.calculator.enums;

public enum Operators {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private char value;

    Operators(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }
}
