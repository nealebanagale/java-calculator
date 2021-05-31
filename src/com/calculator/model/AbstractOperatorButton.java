package com.calculator.model;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class AbstractOperatorButton {
    public double getNum() {
        return 0.00;
    }

    public char getOperator() {
        return '+';
    }
}
