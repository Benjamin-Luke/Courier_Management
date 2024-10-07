//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage {
    public HomePage() {
        final JFrame frame = new JFrame("Online Courier Management System");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, 1));
        buttonPanel.setAlignmentX(0.0F);
        final JButton loginButton = new JButton("Login");
        JButton homeButton = new JButton("Home");
        JButton employeeButton = new JButton("Employee");
        JButton adminButton = new JButton("Admin");
        JButton backButton = new JButton("Back");
        buttonPanel.add(loginButton);
        buttonPanel.add(homeButton);
        buttonPanel.add(employeeButton);
        buttonPanel.add(adminButton);
        buttonPanel.add(backButton);
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(1));
        JLabel headingLabel = new JLabel("Online Courier Management System");
        headingLabel.setFont(new Font("Arial", 0, 50));
        centerPanel.add(headingLabel);
        frame.add(buttonPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                    frame.dispose();
                    new SignupPage();
                }

            }
        });
        homeButton.addActionListener((e) -> {
        });
        backButton.addActionListener((e) -> {
        });
        employeeButton.addActionListener((e) -> {
            if (e.getSource() == employeeButton) {
                frame.dispose();
                new EmployeeLogin();
            }

        });
        adminButton.addActionListener((e) -> {
            if (e.getSource() == adminButton) {
                frame.dispose();
                new AdminLoginPage();
            }

        });
    }
}
