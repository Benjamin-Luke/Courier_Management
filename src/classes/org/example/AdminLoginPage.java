//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminLoginPage {
    public AdminLoginPage() {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2, 0, 10));
        JLabel usernameLabel = new JLabel("User Name:");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        formPanel.add(usernameLabel);
        formPanel.add(usernameField);
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, 1));
        buttonPanel.setAlignmentX(0.0F);
        JButton loginButton = new JButton("Login");
        JButton clearButton = new JButton("Clear");
        buttonPanel.add(loginButton);
        buttonPanel.add(clearButton);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(1));
        centerPanel.add(formPanel);
        centerPanel.add(buttonPanel);
        JPanel navigationPanel = new JPanel();
        navigationPanel.setLayout(new BoxLayout(navigationPanel, 1));
        navigationPanel.setAlignmentX(0.0F);
        JButton homeButton = new JButton("Home");
        JButton employeeButton = new JButton("Employee");
        JButton adminButton = new JButton("Admin");
        JButton backButton = new JButton("Back");
        navigationPanel.add(homeButton);
        navigationPanel.add(employeeButton);
        navigationPanel.add(adminButton);
        navigationPanel.add(backButton);
        frame.add(navigationPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        loginButton.addActionListener((e) -> {
            if (e.getSource() == loginButton) {
                String adminUsername = "admin";
                String adminPassword = "admin";
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());
                if (adminUsername.equals(enteredUsername) && adminPassword.equals(enteredPassword)) {
                    frame.dispose();
                    new AdminPage();
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect details");
                }
            }

        });
        clearButton.addActionListener((e) -> {
            usernameField.setText("");
            passwordField.setText("");
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
