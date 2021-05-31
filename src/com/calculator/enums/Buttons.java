package com.calculator.enums;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public enum Buttons {
    CLEAR("Clear", "clr"),
    DELETE("Delete","del"),
    NEGATIVE("Negative", "(-)"),
    DECIMAL("Decimal",".");

    public final String label;
    public final String value;

    // constructor
    Buttons(String label, String value) {
        this.label = label;
        this.value = value;
    }

    // can implement caching of elements to iterate only once
    private static final Map<String, Buttons> BY_LABEL= new HashMap<>();
    static {
        for (Buttons e: values()) {
            BY_LABEL.put(e.label, e);
        }
    }
    public static Buttons valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }


}
