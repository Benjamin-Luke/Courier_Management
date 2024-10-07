//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminPage {
    public AdminPage() {
        JFrame frame = new JFrame("Admin Page");
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
        JLabel employeeLabel = new JLabel("Employee");
        employeeLabel.setBounds(70, 50, 200, 200);
        JLabel customerLabel = new JLabel("Customer");
        customerLabel.setBounds(70, 100, 200, 200);
        JButton viewEmployeeButton = new JButton("View");
        viewEmployeeButton.setBounds(200, 130, 100, 40);
        JButton updateEmployeeButton = new JButton("Update");
        updateEmployeeButton.setBounds(450, 130, 100, 40);
        JButton viewCustomerButton = new JButton("View");
        viewCustomerButton.setBounds(200, 180, 100, 40);
        JButton updateCustomerButton = new JButton("Update");
        updateCustomerButton.setBounds(450, 180, 100, 40);
        centerPanel.setLayout((LayoutManager)null);
        centerPanel.add(employeeLabel);
        centerPanel.add(customerLabel);
        centerPanel.add(viewEmployeeButton);
        centerPanel.add(viewCustomerButton);
        centerPanel.add(updateEmployeeButton);
        centerPanel.add(updateCustomerButton);
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
                new AdminLoginPage();
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
        viewEmployeeButton.addActionListener((e) -> {
            if (e.getSource() == viewEmployeeButton) {
                frame.dispose();
                new EmployeeViewPage();
            }

        });
        updateEmployeeButton.addActionListener((e) -> {
            if (e.getSource() == updateEmployeeButton) {
                frame.dispose();
                new EmployeeUpdatePage();
            }

        });
        viewCustomerButton.addActionListener((e) -> {
            if (e.getSource() == viewCustomerButton) {
                frame.dispose();
                new CustomerViewPage();
            }

        });
        updateCustomerButton.addActionListener((e) -> {
            if (e.getSource() == updateCustomerButton) {
                frame.dispose();
                new CustomerUpdatePage();
            }

        });
    }
}
