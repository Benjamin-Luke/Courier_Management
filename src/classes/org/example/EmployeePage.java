//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EmployeePage {
    public EmployeePage() {
        JFrame frame = new JFrame("Employee Page");
        frame.setDefaultCloseOperation(3);
        frame.setSize(1000, 400);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
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
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(1));
        JButton viewButton = new JButton("View");
        JButton updateButton = new JButton("Update");
        centerPanel.add(viewButton);
        centerPanel.add(updateButton);
        frame.add(buttonPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        homeButton.addActionListener((e) -> {
            if (e.getSource() == homeButton) {
                frame.dispose();
                new HomePage();
            }

        });
        backButton.addActionListener((e) -> {
            if (e.getSource() == backButton) {
                frame.dispose();
                new EmployeeLogin();
            }

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
                new AdminPage();
            }

        });
        viewButton.addActionListener((e) -> {
            if (e.getSource() == viewButton) {
                frame.dispose();
                new CustomerViewPage();
            }

        });
        updateButton.addActionListener((e) -> {
            if (e.getSource() == updateButton) {
                frame.dispose();
                new CustomerUpdatePage();
            }

        });
    }
}
