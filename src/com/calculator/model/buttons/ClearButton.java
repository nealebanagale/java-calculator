
package com.calculator.model.buttons;

import com.calculator.enums.Buttons;
import com.calculator.interfaces.ISpecialButton;
import javax.swing.*;

public class ClearButton implements ISpecialButton {
    public void setText(JTextField textField) {
        textField.setText("");
    }
}
