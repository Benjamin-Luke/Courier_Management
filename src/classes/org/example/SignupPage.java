//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupPage {
    public SignupPage() {
        JFrame frame = new JFrame("Register");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        JLabel usernameLabel = new JLabel("User Name:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email Address:");
        JTextField emailField = new JTextField(20);
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneField = new JTextField(20);
        JButton registerButton = new JButton("Register");
        JButton alreadyHaveAccountButton = new JButton("Already have an account?");
        JButton clearButton = new JButton("Clear");
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(7, 2, 0, 20));
        labelPanel.add(usernameLabel);
        labelPanel.add(passwordLabel);
        labelPanel.add(nameLabel);
        labelPanel.add(emailLabel);
        labelPanel.add(addressLabel);
        labelPanel.add(phoneLabel);
        JPanel textfieldPanel = new JPanel();
        textfieldPanel.setLayout(new GridLayout(7, 2, 0, 20));
        textfieldPanel.add(usernameField);
        textfieldPanel.add(passwordField);
        textfieldPanel.add(nameField);
        textfieldPanel.add(emailField);
        textfieldPanel.add(addressField);
        textfieldPanel.add(phoneField);
        JPanel FunctionButtonPanel = new JPanel();
        FunctionButtonPanel.setLayout(new FlowLayout(1));
        FunctionButtonPanel.add(registerButton);
        FunctionButtonPanel.add(clearButton);
        FunctionButtonPanel.add(alreadyHaveAccountButton);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(1));
        centerPanel.add(labelPanel, "North");
        centerPanel.add(textfieldPanel, "Center");
        centerPanel.add(FunctionButtonPanel, "South");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, 1));
        buttonPanel.setAlignmentX(0.0F);
        JButton homeButton = new JButton("Home");
        JButton employeeButton = new JButton("Employee");
        JButton adminButton = new JButton("Admin");
        JButton backButton = new JButton("Back");
        buttonPanel.add(homeButton);
        buttonPanel.add(employeeButton);
        buttonPanel.add(adminButton);
        buttonPanel.add(backButton);
        frame.add(buttonPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        registerButton.addActionListener((e) -> {
        });
        alreadyHaveAccountButton.addActionListener((e) -> {
            if (e.getSource() == alreadyHaveAccountButton) {
                frame.dispose();
                new LoginPage();
            }

        });
        clearButton.addActionListener((e) -> {
            usernameField.setText("");
            passwordField.setText("");
            nameField.setText("");
            emailField.setText("");
            addressField.setText("");
            phoneField.setText("");
        });
        homeButton.addActionListener((e) -> {
            if (e.getSource() == homeButton) {
                frame.dispose();
                new HomePage();
            }

        });
        backButton.addActionListener((e) -> {
            if (e.getSource() == backButton) {
                frame.dispose();
                new HomePage();
            }

        });
        employeeButton.addActionListener((e) -> {
            if (e.getSource() == employeeButton) {
                frame.dispose();
                new EmployeeLogin();
            }

        });
        adminButton.addActionListener((e) -> {
        });
    }
}
