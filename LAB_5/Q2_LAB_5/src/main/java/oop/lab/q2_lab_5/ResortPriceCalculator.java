/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.q2_lab_5;

/**
 *
 * @author hanie
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ResortPriceCalculator extends JFrame {

    private JLabel basePriceLabel, guestNameLabel, outputLabel;
    private JTextField guestNameField;
    private JCheckBox breakfastCheckBox, golfCheckBox, poolCheckBox;
    private JButton calculateButton;
    private JComboBox<String> dayComboBox;

    public ResortPriceCalculator() {

        //form
        setTitle("Resort Price Calculator");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //layout control
        JPanel panel = new JPanel(new GridLayout(0,1));

        basePriceLabel = new JLabel("Base price for a room is $200" + "\n"
                + "Choose options that you want");
        
        guestNameLabel = new JLabel("Guest Name:");
        guestNameField = new JTextField(10);
        breakfastCheckBox = new JCheckBox("Breakfast $20");
        golfCheckBox = new JCheckBox("Golf $50");
        poolCheckBox = new JCheckBox("Pool $15");

        dayComboBox = new JComboBox<>(new String[]{"Week day (-10%)", "Weekend (+30%)"});
        calculateButton = new JButton("Calculate");
        outputLabel = new JLabel("Your payment is: ");

        //Add control to Layout(inputPanel Layout)
        panel.add(basePriceLabel);
        panel.add(guestNameLabel);
        panel.add(guestNameField);
        panel.add(breakfastCheckBox);
        panel.add(golfCheckBox);
        panel.add(poolCheckBox);
        panel.add(dayComboBox);
        panel.add(calculateButton);
        panel.add(outputLabel);

       
//        panel.add(basePriceLabel, BorderLayout.NORTH);
//        panel.add(guestNameLabel, BorderLayout.CENTER);

        calculateButton.addActionListener(e -> calculateButton());

        // Add panel to frame
        add(panel);
    }

    private void calculateButton() {
        String guestName = guestNameField.getText().trim();
        if (guestName.isEmpty()) {
            outputLabel.setText("Please enter the guest name.");
            return;
        }

        double basePrice = 200.0;
        if (breakfastCheckBox.isSelected()) {
            basePrice += 20;
        }
        if (golfCheckBox.isSelected()) {
            basePrice += 50;
        }
        if (poolCheckBox.isSelected()) {
            basePrice += 15;
        }

        double multiplier = 1.0;
        if (dayComboBox.getSelectedItem().equals("Weekend (+30%)")) {
            multiplier = 1.3;
        } else if (dayComboBox.getSelectedItem().equals("Week day (-10%)")) {
            multiplier = 0.9;
        }

        double totalPrice = basePrice * multiplier;

        outputLabel.setText("Hello " + guestName + " Your payment is: $" + String.format("%.2f", totalPrice));
    }
}
