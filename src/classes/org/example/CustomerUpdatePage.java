//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;

public class CustomerUpdatePage {

    private String url = "jdbc:mysql://127.0.0.1:3306/school_management";
    private String user = "ben";
    private String password = "example-password";

    public CustomerUpdatePage() {
        JFrame frame = new JFrame("Update Customer Info");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(7, 2, 0, 20));
        JPanel textfieldPanel = new JPanel();
        textfieldPanel.setLayout(new GridLayout(7, 2, 0, 20));
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
        labelPanel.add(usernameLabel);
        labelPanel.add(passwordLabel);
        labelPanel.add(nameLabel);
        labelPanel.add(emailLabel);
        labelPanel.add(addressLabel);
        labelPanel.add(phoneLabel);
        textfieldPanel.add(usernameField);
        textfieldPanel.add(passwordField);
        textfieldPanel.add(nameField);
        textfieldPanel.add(emailField);
        textfieldPanel.add(addressField);
        textfieldPanel.add(phoneField);
        JButton updateButton = new JButton("Update");
        JButton clearButton = new JButton("Clear");
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(1));
        centerPanel.add(labelPanel, "East");
        centerPanel.add(textfieldPanel, "West");
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
        centerPanel.add(updateButton);
        centerPanel.add(clearButton);
        frame.add(buttonPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        updateButton.addActionListener((event) -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String name = nameField.getText();
            String email = emailField.getText();
            String address = addressField.getText();
            String phoneNumber = phoneField.getText();

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement();

                String query = sql.replace("$table",table);
                statement.executeQuery(query);

                ResultSet resultSet = statement.getResultSet();

                while (resultSet.next()) {
                    list.add(resultSet.getString("name"));
                }




//                PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\benja\\OneDrive\\Desktop\\Courier_Management\\src\\main\\java\\org\\example\\Customer.txt", true));
//                writer.println("\n" + username + "," + password + "," + name + "," + email + "," + address + "," + phoneNumber);
//                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            usernameField.setText("");
            passwordField.setText("");
            nameField.setText("");
            emailField.setText("");
            addressField.setText("");
            phoneField.setText("");
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
                new EmployeePage();
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
