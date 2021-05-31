package com.calculator.model.buttons;

import com.calculator.enums.Operators;
import com.calculator.model.AbstractOperatorButton;

import javax.swing.*;

public class AdditionButton extends AbstractOperatorButton {
    private JTextField textField;

    public AdditionButton(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public double getNum() {
        return Double.parseDouble(this.textField.getText());
    }

    @Override
    public char getOperator() {
        return Operators.ADDITION.getValue();
    }
}
