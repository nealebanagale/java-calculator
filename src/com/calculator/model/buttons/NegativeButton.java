package com.calculator.model.buttons;

import com.calculator.enums.Buttons;
import com.calculator.interfaces.ISpecialButton;

import javax.swing.*;

public class NegativeButton implements ISpecialButton {
    public void setText(JTextField textField) {
        double temp = Double.parseDouble(textField.getText());
        temp *= -1;
        textField.setText(String.valueOf(temp));
    }
}


