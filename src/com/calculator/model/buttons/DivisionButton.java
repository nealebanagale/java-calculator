package com.calculator.model.buttons;

import com.calculator.enums.Operators;
import com.calculator.model.AbstractOperatorButton;

import javax.swing.*;

public class DivisionButton extends AbstractOperatorButton {
    private JTextField textField;

    public DivisionButton(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public double getNum() {
        return Double.parseDouble(this.textField.getText());
    }

    @Override
    public char getOperator() {
        return Operators.DIVISION.getValue();
    }
}

