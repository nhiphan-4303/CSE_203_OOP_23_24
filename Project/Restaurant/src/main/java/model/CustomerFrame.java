/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package model;

import java.awt.event.*;
import java.beans.Statement;
import java.io.*;
import static java.lang.Character.isDigit;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author maianhtran
 */
public class CustomerFrame extends javax.swing.JDialog {

    /**
     * Creates new form CustomerFrame
     */
    Scanner sc = new Scanner(System.in);
    java.awt.event.ActionEvent evt;
    ManageCustomer manageCustomer = new ManageCustomer();

    public CustomerFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        customerTable.setDefaultEditor(Object.class, null);
        this.setLocationRelativeTo(null);

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
        java.awt.GridBagConstraints gridBagConstraints;

        JPopupMenu = new javax.swing.JPopupMenu();
        deleteMenuItem = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        clearButton = new javax.swing.JButton();
        totalButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        fullNameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        customerIDField = new javax.swing.JTextField();
        phoneNumberField = new javax.swing.JTextField();

        deleteMenuItem.setText("Delete");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        JPopupMenu.add(deleteMenuItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        backButton.setFont(new java.awt.Font("Gurmukhi MN", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(102, 102, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        searchField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer ID", "Full name", "Phone number", "Address", "Email"
            }
        ));
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        customerTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        clearButton.setFont(new java.awt.Font("Gurmukhi MN", 1, 18)); // NOI18N
        clearButton.setForeground(new java.awt.Color(102, 102, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        totalButton.setFont(new java.awt.Font("Gurmukhi MN", 1, 18)); // NOI18N
        totalButton.setForeground(new java.awt.Color(102, 102, 255));
        totalButton.setText("Total");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Gurmukhi MN", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(102, 102, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Gurmukhi MN", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(102, 102, 255));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addGap(82, 82, 82)
                .addComponent(saveButton)
                .addGap(103, 103, 103)
                .addComponent(totalButton)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(clearButton)
                    .addComponent(totalButton)
                    .addComponent(saveButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        fullNameField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        fullNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Full name", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N

        addressField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        addressField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N

        emailField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        emailField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N

        customerIDField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        customerIDField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N

        phoneNumberField.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        phoneNumberField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone number", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gurmukhi MN", 1, 18), new java.awt.Color(102, 102, 255)), new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true))); // NOI18N
        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(442, 442, 442)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 40, 53, 10);
        jPanel1.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearButton();

    }//GEN-LAST:event_clearButtonActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        JOptionPane.showMessageDialog(this, "There are " + manageCustomer.getListCustomer().size() + " customers.");
    }//GEN-LAST:event_totalButtonActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        getDataFromTable();
    }//GEN-LAST:event_customerTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String customerID = customerIDField.getText();
        String fullName = fullNameField.getText();
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();

        try {
            int phone = Integer.parseInt(phoneNumber);

            if (fullName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Full name cannot be empty.");
                fullNameField.requestFocus();
                return;
            } else if (customerID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Customer ID cannot be empty.");
                customerIDField.requestFocus();
                return;
            }

            Customer c = new Customer(customerID, fullName, address, phone, email);

            if (manageCustomer.searchCustomerByID(c)) {
                manageCustomer.getListCustomer().add(c);
                JOptionPane.showMessageDialog(this, "Adding customer successful.");
                saveCustomers();
                clearButton();
            } else {
                JOptionPane.showMessageDialog(this, "Customert ID is already exist.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Phone number must be numbers.");
            phoneNumberField.requestFocus();
        }
        fillInCustomerTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        String searchText = searchField.getText().trim();
        ArrayList<Customer> searchResults = doSearch(searchText);
        model.setRowCount(0);

        for (Customer c : searchResults) {
            Object[] rows = {c.getCustomerID(), c.getCustomerName(), c.getPhoneNumber(), c.getAddress(), c.getEmail()};
            model.addRow(rows);
        }

    }//GEN-LAST:event_searchFieldKeyReleased

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void customerTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerTableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_customerTableKeyReleased

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        int selectedRow = customerTable.getSelectedRow();

        if (selectedRow != -1) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this customer?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                manageCustomer.getListCustomer().remove(selectedRow);
                saveCustomers();
            }
            fillInCustomerTable();
        }

    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();

        int selectedRow = customerTable.getSelectedRow();

        if (selectedRow != -1) {
            String customerID = customerIDField.getText();
            Customer customerToEdit = manageCustomer.findCustomer(customerID); // Corrected method to find a customer

            if (customerToEdit != null) {
                try {
                    int phone = Integer.parseInt(phoneNumberField.getText()); // Ensure parsing is done before setting
                    customerToEdit.setCustomerName(fullNameField.getText());
                    customerToEdit.setPhoneNumber(phone);
                    customerToEdit.setAddress(addressField.getText());
                    customerToEdit.setEmail(emailField.getText());

                    // Updating model values should be within the try block after successful parsing
                    model.setValueAt(customerToEdit.getCustomerName(), selectedRow, 1);
                    model.setValueAt(customerToEdit.getPhoneNumber(), selectedRow, 2);
                    model.setValueAt(customerToEdit.getAddress(), selectedRow, 3);
                    model.setValueAt(customerToEdit.getEmail(), selectedRow, 4);

                    saveCustomers(); // Assumes this method correctly serializes the updated list to a file

                    JOptionPane.showMessageDialog(this, "Customer information updated successfully.");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid phone number format. Please enter a valid number.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error: Customer not found.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No customer selected to edit.");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private ArrayList<Customer> doSearch(String searchText) {
        ArrayList<Customer> searchResults = new ArrayList<>();
        for (Customer c : manageCustomer.getListCustomer()) {
            String phone = Integer.toString(c.getPhoneNumber());
            if (c.getCustomerName().toLowerCase().contains(searchText.toLowerCase())
                    || phone.contains(searchText)) {
                searchResults.add(c);
            }
        }
        return searchResults;

    }

    private void getDataFromTable() {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();

        int selectedRow = customerTable.getSelectedRow();
        Customer c = manageCustomer.getListCustomer().get(selectedRow);
        customerIDField.setText(c.getCustomerID().toString());
        fullNameField.setText(c.getCustomerName().toString());
        phoneNumberField.setText(String.valueOf(c.getPhoneNumber()));
        addressField.setText(c.getAddress());
        emailField.setText(c.getEmail());
    }

    private void fillInCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        for (Customer c : manageCustomer.getListCustomer()) {
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
            oos.writeObject(manageCustomer.getListCustomer());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving customers to file.");
        }
    }

    private void loadCustomers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Customers.Dat"))) {
            manageCustomer.setListCustomer((ArrayList<Customer>) ois.readObject());

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading customers from file.");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomerFrame dialog = new CustomerFrame(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu JPopupMenu;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField customerIDField;
    private javax.swing.JTable customerTable;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton totalButton;
    // End of variables declaration//GEN-END:variables
}
