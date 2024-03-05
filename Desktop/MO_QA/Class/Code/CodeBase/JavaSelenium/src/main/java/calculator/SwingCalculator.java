package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator {
    private JTextField textField;
    private double firstNumber = 0;
    private char operator = ' ';
    private boolean isOperatorClicked = false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingCalculator().createAndShowGUI());
    }

    private void createAndShowGUI() 
    {
        JFrame frame = new JFrame("Basic Calculator");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 500);

        textField = new JTextField();
        textField.setEditable(false);

        JPanel buttonPanel = createButtonPanel();

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        return panel;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.equals("=")) {
                calculateResult();
            } else if (buttonText.equals(".")) {
                handleDecimalPoint();
            } else {
                handleNumberOrOperator(buttonText);
            }
        }
    }

    private void handleNumberOrOperator(String buttonText) {
        if (Character.isDigit(buttonText.charAt(0))) {
            handleDigit(buttonText);
        } else if (buttonText.length() == 1) {
            handleOperator(buttonText.charAt(0));
        }
    }

    private void handleDigit(String digit) {
        if (isOperatorClicked) {
            textField.setText(digit);
            isOperatorClicked = false;
        } else {
            textField.setText(textField.getText() + digit);
        }
    }

    private void handleOperator(char newOperator) {
        if (operator != ' ') {
            calculateResult();
        }
        operator = newOperator;
        firstNumber = Double.parseDouble(textField.getText());
        isOperatorClicked = true;
    }

    private void handleDecimalPoint() {
        if (!textField.getText().contains(".")) {
            textField.setText(textField.getText() + ".");
        }
    }

    private void calculateResult() {
        double secondNumber = Double.parseDouble(textField.getText());
        switch (operator) {
            case '+':
                firstNumber += secondNumber;
                break;
            case '-':
                firstNumber -= secondNumber;
                break;
            case '*':
                firstNumber *= secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    firstNumber /= secondNumber;
                } else {
                    textField.setText("Error: Division by zero");
                    clearCalculator();
                    return;
                }
                break;
        }
        textField.setText(String.valueOf(firstNumber));
        operator = ' ';
        isOperatorClicked = true;
    }

    private void clearCalculator() {
        firstNumber = 0;
        operator = ' ';
        isOperatorClicked = false;
    }
}
