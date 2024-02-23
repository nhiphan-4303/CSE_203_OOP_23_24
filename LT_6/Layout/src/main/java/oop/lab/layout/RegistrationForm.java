/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.layout;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hanie
 */
public class RegistrationForm extends JFrame {

    private JTextField nameField, mobileField, addressField;
    private JButton submitButton, resetButton;
    private JRadioButton genderField; 
    private JComboBox dobField;

    //create form
    public RegistrationForm() {

        //init form
        setTitle(" Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Layout control
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        JTextArea textArea = new JTextArea("Type here", 5, 20);

        nameField = new JTextField();
        mobileField = new JTextField();

        genderField = new JRadioButton();
        dobField = new JComboBox();

        addressField = new JTextField();

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        //Add control to Layout(inputPanel Layout)
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Mobile:"));
        inputPanel.add(mobileField);
        
        inputPanel.add(new JLabel("Gender:"));
        inputPanel.add(genderField);
        inputPanel.add(new JLabel("DOB:"));
        inputPanel.add(dobField);
        
        inputPanel.add(new JLabel("Address:"));
        inputPanel.add(addressField);

        inputPanel.add(submitButton);
        inputPanel.add(resetButton);

        //Add imputPanel layout to mainpanel Layout
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(submitButton, BorderLayout.WEST);
        mainPanel.add(resetButton, BorderLayout.EAST);

        //add to form (this)
        add(mainPanel);
        //setVisible(true);

    }

}
