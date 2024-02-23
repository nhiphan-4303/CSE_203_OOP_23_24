/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.mavenproject2;

/**
 *
 * @author hanie
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
//Extend Jframe
public class EmployeeDetailForm extends JFrame {
    private JTextField firstNameField, lastNameField, ageField, occupationField, identityCardNumberField,
            salaryField, numberDependantsField, numberOfficeField;
    private JButton addButton, editButton, deleteButton, displayButton;
    private JList<String> employeeList;
    private DefaultListModel<String> listModel;
    private ArrayList<Employee> employees;
    //Create form
    public EmployeeDetailForm() {
        //init form
        setTitle("Employee Details");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Layout control
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(9, 2, 5, 5));

        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ageField = new JTextField();
        occupationField = new JTextField();
        identityCardNumberField = new JTextField();
        salaryField = new JTextField();
        numberDependantsField = new JTextField();
        numberOfficeField = new JTextField();
        addButton = new JButton("Add");
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        displayButton = new JButton("Display");
        listModel = new DefaultListModel<>();
        employeeList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(employeeList);
        //Add control to Layout(inputPanel Layout)
        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(firstNameField);
        inputPanel.add(new JLabel("Last Name:"));
        inputPanel.add(lastNameField);
        inputPanel.add(new JLabel("Age:"));
        inputPanel.add(ageField);
        inputPanel.add(new JLabel("Occupation:"));
        inputPanel.add(occupationField);
        inputPanel.add(new JLabel("Identity Card Number:"));
        inputPanel.add(identityCardNumberField);
        inputPanel.add(new JLabel("Salary:"));
        inputPanel.add(salaryField);
        inputPanel.add(new JLabel("Number of Dependents:"));
        inputPanel.add(numberDependantsField);
        inputPanel.add(new JLabel("Number of Office:"));
        inputPanel.add(numberOfficeField);
        inputPanel.add(addButton);
        inputPanel.add(editButton);
        //Add imputPanel layout to mainpanel Layout
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(listScrollPane, BorderLayout.CENTER);
        mainPanel.add(deleteButton, BorderLayout.SOUTH);
        mainPanel.add(displayButton, BorderLayout.EAST);

        addButton.addActionListener(e -> addEmployee());
        editButton.addActionListener(e -> editEmployee());
        deleteButton.addActionListener(e -> deleteEmployee());
        displayButton.addActionListener(e -> displayEmployeeDetails());
      
        //add to form (this)
        add(mainPanel);
     //   setVisible(true);

        employees = new ArrayList<>();
        loadEmployees(); // Load employees from file on startup
    }
    // add a employee
    private void addEmployee() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        int age = Integer.parseInt(ageField.getText());
        String occupation = occupationField.getText();
        String identityCardNumber = identityCardNumberField.getText();
        double salary = Double.parseDouble(salaryField.getText());
        int numberDependants = Integer.parseInt(numberDependantsField.getText());
        int numberOffice = Integer.parseInt(numberOfficeField.getText());

        Employee employee = new Employee(firstName, lastName, age, occupation, identityCardNumber, salary,
                numberDependants, numberOffice);
        employees.add(employee);
        listModel.addElement(employee.getFullName());
        //Save file
        saveEmployees(); // Save employees to file after adding
        clearFields();
    }
    //Edit a employee
    private void editEmployee() {
        int selectedIndex = employeeList.getSelectedIndex();
        if (selectedIndex != -1) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String occupation = occupationField.getText();
            String identityCardNumber = identityCardNumberField.getText();
            double salary = Double.parseDouble(salaryField.getText());
            int numberDependants = Integer.parseInt(numberDependantsField.getText());
            int numberOffice = Integer.parseInt(numberOfficeField.getText());

            Employee employee = employees.get(selectedIndex);
            employee.setFirstName(firstName);
            employee.setLastName(lastName);
            employee.setAge(age);
            employee.setOccupation(occupation);
            employee.setIdentityCardNumber(identityCardNumber);
            employee.setSalary(salary);
            employee.setNumberDependants(numberDependants);
            employee.setNumberOffice(numberOffice);

            listModel.setElementAt(employee.getFullName(), selectedIndex);
            saveEmployees(); // Save employees to file after editing
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to edit.");
        }
    }

    private void deleteEmployee() {
        int selectedIndex = employeeList.getSelectedIndex();
        if (selectedIndex != -1) {
            employees.remove(selectedIndex);
            listModel.remove(selectedIndex);
            saveEmployees(); // Save employees to file after deletion
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to delete.");
        }
    }

    private void displayEmployeeDetails() {
        int selectedIndex = employeeList.getSelectedIndex();
        if (selectedIndex != -1) {
            Employee employee = employees.get(selectedIndex);
            JOptionPane.showMessageDialog(this,
                    "First Name: " + employee.getFirstName() +
                            "\nLast Name: " + employee.getLastName() +
                            "\nAge: " + employee.getAge() +
                            "\nOccupation: " + employee.getOccupation() +
                            "\nIdentity Card Number: " + employee.getIdentityCardNumber() +
                            "\nSalary: " + employee.getSalary() +
                            "\nNumber of Dependents: " + employee.getNumberDependants() +
                            "\nNumber of Office: " + employee.getNumberOffice());
        } else {
            JOptionPane.showMessageDialog(this, "Please select an employee to display.");
        }
    }

    private void clearFields() {
        firstNameField.setText("");
        lastNameField.setText("");
        ageField.setText("");
        occupationField.setText("");
        identityCardNumberField.setText("");
        salaryField.setText("");
        numberDependantsField.setText("");
        numberOfficeField.setText("");
    }

    private void saveEmployees() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving employees to file.");
        }
    }

    private void loadEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            employees = (ArrayList<Employee>) ois.readObject();
            for (Employee employee : employees) {
                listModel.addElement(employee.getFullName());
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading employees from file.");
        }
    }

    

   
}
