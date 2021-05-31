package com.calculator.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class AbstractSpecialButton {
    public void setTextField(ActionEvent event, TextField textField, JButton button) {
        textField.setText("");
    }
}
