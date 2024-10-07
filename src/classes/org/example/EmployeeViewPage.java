//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package classes.org.example;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeViewPage {
    public EmployeeViewPage() {
        JFrame frame = new JFrame("Employee View Page");
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
        centerPanel.setLayout(new BorderLayout());
        String[] columnNames = new String[]{"User Name", "Password", "Name", "Email Address", "Address", "Phone Number"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\benja\\OneDrive\\Desktop\\Courier_Management\\src\\main\\java\\org\\example\\Employee.txt"));

            String line;
            while((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                model.addRow(rowData);
            }

            reader.close();
        } catch (IOException var14) {
            IOException e = var14;
            e.printStackTrace();
        }

        centerPanel.add(new JScrollPane(table), "Center");
        frame.add(buttonPanel, "West");
        frame.add(centerPanel, "Center");
        frame.setVisible(true);
        homeButton.addActionListener((ex) -> {
            if (ex.getSource() == homeButton) {
                frame.dispose();
                new HomePage();
            }

        });
        backButton.addActionListener((ex) -> {
            if (ex.getSource() == backButton) {
                frame.dispose();
                new EmployeePage();
            }

        });
        employeeButton.addActionListener((ex) -> {
            if (ex.getSource() == employeeButton) {
                frame.dispose();
                new EmployeeLogin();
            }

        });
        adminButton.addActionListener((ex) -> {
            if (ex.getSource() == adminButton) {
                frame.dispose();
                new AdminPage();
            }

        });
    }
}
