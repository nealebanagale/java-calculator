package com.calculator;

import com.calculator.model.buttons.*;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.calculator.enums.Buttons;

public class Main implements ActionListener {
    JFrame frame;
    JTextField textField;
    // Array
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton,subButton,mulButton,divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;
    Font myFont = new Font("Arial", Font.BOLD,30);

    // types
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    char operator; // primitive

    // HashMap
    Map <Integer,String> buttonsMap = new HashMap<Integer, String>();

    // constructor
    Main() {
        // hashmap elements
        buttonsMap.put(1, "+");
        buttonsMap.put(2, "-");
        buttonsMap.put(3, "*");
        buttonsMap.put(4, "/");
        buttonsMap.put(5, ".");
        buttonsMap.put(6, "=");
        buttonsMap.put(9, "(-)");


        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // close program
        frame.setSize(420, 550);
        frame.setLayout(null);

        // text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        // Buttons
        addButton = new JButton(buttonsMap.get(1));
        subButton = new JButton(buttonsMap.get(2));
        mulButton = new JButton(buttonsMap.get(3));
        divButton = new JButton(buttonsMap.get(4));
        decButton = new JButton(buttonsMap.get(5));
        equButton = new JButton(buttonsMap.get(6));
        delButton = new JButton(Buttons.DELETE.getValue());  //  custom method
        clrButton = new JButton(Buttons.valueOfLabel("Clear").getValue()); // cache
        negButton = new JButton(Buttons.NEGATIVE.toString());   // override method

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        negButton.setBounds(50,430,100,50);
        delButton.setBounds(150, 430, 100,50);
        clrButton.setBounds(250, 430, 100,50);


        panel = new JPanel();
        panel.setBounds(50, 100, 300,300);
        panel.setLayout(new GridLayout(4,4, 10, 10));

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main calc = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(int i = 0; i < 10; i++) {
            if(actionEvent.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if(actionEvent.getSource() == addButton) {
            AdditionButton additionButton = new AdditionButton(textField);
            num1 = additionButton.getNum();
            operator = additionButton.getOperator();
            textField.setText("");
        }

        if(actionEvent.getSource() == subButton) {
            SubtractionButton subtractionButton = new SubtractionButton(textField);
            num1 = subtractionButton.getNum();
            operator = subtractionButton.getOperator();
            textField.setText("");
        }
        if(actionEvent.getSource() == mulButton) {
            MultiplicationButton multiplicationButton = new MultiplicationButton(textField);
            num1 = multiplicationButton.getNum();
            operator = multiplicationButton.getOperator();
            textField.setText("");
        }
        if(actionEvent.getSource() == divButton) {
            DivisionButton divisionButton = new DivisionButton(textField);
            num1 = divisionButton.getNum();
            operator = divisionButton.getOperator();
            textField.setText("");
        }

        if(actionEvent.getSource() == decButton) {
            DecimalButton decimalButton = new DecimalButton();
            decimalButton.setText(textField);
        }


        if(actionEvent.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        if (actionEvent.getSource() == clrButton) {
            ClearButton clearButton = new ClearButton();
            clearButton.setText(textField);
        }
        if (actionEvent.getSource() == delButton) {
            DeleteButton deleteButton = new DeleteButton();
            deleteButton.setText(textField);
        }
        if(actionEvent.getSource() == negButton) {
            NegativeButton negativeButton = new NegativeButton();
            negativeButton.setText(textField);
        }
    }
}
