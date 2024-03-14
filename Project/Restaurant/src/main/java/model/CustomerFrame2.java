/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.ManageCustomer;

/**
 *
 * @author Asus
 */
public class CustomerFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form BookInformation
     */
    java.awt.event.ActionEvent evt;
    ManageCustomer manageCustomer = new ManageCustomer();

    public CustomerFrame2() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        loadCustomers();
        fillInCustomerTable();
        customerTable.putClientProperty("JTable.autoStartsEdit", Boolean.FALSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customerIDLabel = new javax.swing.JLabel();
        customerIDField = new javax.swing.JTextField();
        fullNameLabel = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        searchButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        JScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerIDLabel.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        customerIDLabel.setForeground(new java.awt.Color(255, 0, 51));
        customerIDLabel.setText("Customer ID");
        getContentPane().add(customerIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, -1));
        getContentPane().add(customerIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 214, -1));

        fullNameLabel.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        fullNameLabel.setForeground(new java.awt.Color(255, 0, 51));
        fullNameLabel.setText("Full name");
        getContentPane().add(fullNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 80, -1));

        fullNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(fullNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 214, -1));

        phoneNumberLabel.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(255, 0, 51));
        phoneNumberLabel.setText("Phone number");
        getContentPane().add(phoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 90, -1));
        getContentPane().add(phoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 214, -1));

        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 214, -1));

        addressLabel.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 0, 51));
        addressLabel.setText("Address");
        getContentPane().add(addressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 90, -1));

        emailLabel.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 0, 51));
        emailLabel.setText("Email");
        getContentPane().add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 90, -1));

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 214, -1));
        getContentPane().add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 214, -1));

        addButton.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 0, 153));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        totalButton.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        totalButton.setForeground(new java.awt.Color(153, 0, 153));
        totalButton.setText("Total");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(totalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, -1, -1));

        deleteButton.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(153, 0, 153));
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, -1, -1));

        editButton.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(153, 0, 153));
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        searchButton1.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        searchButton1.setForeground(new java.awt.Color(153, 0, 153));
        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        backButton.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 0, 153));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        customerTable.setFont(new java.awt.Font("SF Cartoonist Hand", 0, 18)); // NOI18N
        customerTable.setForeground(new java.awt.Color(0, 204, 102));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Full name", "Phone number", "Address", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerTable.getTableHeader().setReorderingAllowed(false);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        JScrollPane1.setViewportView(customerTable);

        getContentPane().add(JScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 620, 480));

        background.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://img-qn-4.51miz.com/preview/video/00/00/12/78/V-127850-126EC702.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        background.setText("Total");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String customerID = customerIDField.getText();
        String fullName = fullNameField.getText();
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();

        try {
            int phone = Integer.parseInt(phoneNumber);
            if (!fullName.isEmpty() && !customerID.isEmpty()) {
                Customer c = new Customer(customerID, fullName, address, phone, email);
                if (manageCustomer.searchCustomerByID(c)) {
                    manageCustomer.listCustomer.add(c);
                    JOptionPane.showMessageDialog(this, "Adding customer successful.");
                    saveCustomers();
                    clearButton();
                } else {
                    JOptionPane.showMessageDialog(this, "Customert ID is already exist.");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Customer ID and full name can not be empty.");
                return;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Phone number must be numbers.");
        }
        fillInCustomerTable();

    }//GEN-LAST:event_addButtonActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        JOptionPane.showMessageDialog(this, "There are " + manageCustomer.getListCustomer().size() + " customers.");

    }//GEN-LAST:event_totalButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();

        int deleteIndex = customerTable.getSelectedRow();
        if (deleteIndex != -1) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this customer?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                manageCustomer.getListCustomer().remove(deleteIndex);

            }
            saveCustomers();
            fillInCustomerTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed

        addButtonActionPerformed(evt);
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        getDataFromTable();
    }//GEN-LAST:event_customerTableMouseClicked

    /**
     * @param args the command line arguments
     */
    private void getDataFromTable() {
        int selectedRow = customerTable.getSelectedRow();
        Customer c = manageCustomer.listCustomer.get(selectedRow);
        customerIDField.setText(c.getCustomerID().toString());
        fullNameField.setText(c.getCustomerName().toString());
        phoneNumberField.setText(String.valueOf(c.getPhoneNumber()));
        addressField.setText(c.getAddress());
        emailField.setText(c.getEmail());
    }

    private void fillInCustomerTable() {
        //Delete all row
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //Add row

        for (Customer c : manageCustomer.listCustomer) {
            Object[] rows = new Object[]{c.getCustomerID(), c.getCustomerName(), c.getPhoneNumber(), c.getAddress(), c.getEmail()};
            model.addRow(rows);
        }

        pack();
    }

    private void clearButton() {
        customerIDField.setText("");
        fullNameField.setText("");
        addressField.setText("");
        phoneNumberField.setText("");
        emailField.setText("");
    }

    private void saveCustomers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Customers.Dat"))) {
            oos.writeObject(manageCustomer.listCustomer);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving customers to file.");
        }
    }

    private void loadCustomers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Customers.Dat"))) {
            manageCustomer.listCustomer = (ArrayList<Customer>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading customers from file.");
        }
    }

    public static void main(String args[]) {

        new CustomerFrame2().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JLabel customerIDLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton searchButton1;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton totalButton;
    // End of variables declaration//GEN-END:variables
}
