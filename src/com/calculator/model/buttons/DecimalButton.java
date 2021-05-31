package com.calculator.model.buttons;

import com.calculator.enums.Buttons;
import com.calculator.interfaces.ISpecialButton;

import javax.swing.*;

public class DecimalButton implements ISpecialButton {
    public void setText(JTextField textField) {
        textField.setText(textField.getText().concat(Buttons.DECIMAL.getValue()));
    }
}
