package com.calculator.model.buttons;

import com.calculator.enums.Buttons;
import com.calculator.interfaces.ISpecialButton;

import javax.swing.*;

public class DeleteButton implements ISpecialButton {
    public void setText(JTextField textField) {
        String temp = textField.getText();
        textField.setText("");
        for(int i =0; i < temp.length() -1; i++) {
            textField.setText(textField.getText() + temp.charAt(i));
        }
    }
}

