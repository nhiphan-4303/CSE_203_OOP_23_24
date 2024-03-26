/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.phanngochanhnhi_2131209002;

import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    private EmployeeManageMain employeeList = new EmployeeManageMain();

    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
        showInfoTxtArea.setEditable(false);
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

        emailLabel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        monthlyIncomeLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        numberOfDependentsLabel = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showInfoTxtArea = new javax.swing.JTextArea();
        nameTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        monthlyIncomeTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        phoneNumberTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        numberOfDependentCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Income Tax Calculate");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        nameLabel.setText("Name:");

        ageLabel.setText("Age:");

        monthlyIncomeLabel.setText("Monthly Income:");

        phoneNumberLabel.setText("Phone Number:");

        addressLabel.setText("Address:");

        jLabel6.setText("Email:");

        numberOfDependentsLabel.setText("Number of Dependents:");

        calculateBtn.setText("Calculate");
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        showInfoTxtArea.setColumns(20);
        showInfoTxtArea.setRows(5);
        jScrollPane1.setViewportView(showInfoTxtArea);

        numberOfDependentCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        numberOfDependentCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfDependentCmbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emailLabelLayout = new javax.swing.GroupLayout(emailLabel);
        emailLabel.setLayout(emailLabelLayout);
        emailLabelLayout.setHorizontalGroup(
            emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLabelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(calculateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addGap(93, 93, 93))
            .addGroup(emailLabelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(emailLabelLayout.createSequentialGroup()
                        .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(ageLabel)
                            .addComponent(monthlyIncomeLabel)
                            .addComponent(addressLabel)
                            .addComponent(phoneNumberLabel)
                            .addComponent(jLabel6)
                            .addComponent(numberOfDependentsLabel))
                        .addGap(100, 100, 100)
                        .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOfDependentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(ageTxt)
                                .addComponent(monthlyIncomeTxt)
                                .addComponent(addressTxt)
                                .addComponent(phoneNumberTxt)
                                .addComponent(emailTxt)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        emailLabelLayout.setVerticalGroup(
            emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLabelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyIncomeLabel)
                    .addComponent(monthlyIncomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfDependentsLabel)
                    .addComponent(numberOfDependentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(emailLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateBtn)
                    .addComponent(clearBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        getContentPane().add(emailLabel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberOfDependentCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfDependentCmbActionPerformed

    }//GEN-LAST:event_numberOfDependentCmbActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearForm();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        if (!isFill()) {
            JOptionPane.showMessageDialog(this, "Please check all fields!");
            return;
        }
        try {
            int age = Integer.parseInt(ageTxt.getText());
            long monthlyIncome = Long.parseLong(monthlyIncomeTxt.getText());

            String name = nameTxt.getText();
            String address = addressTxt.getText();
            String phoneNumber = phoneNumberTxt.getText();
            String email = emailTxt.getText();
            int numberOfDependent = Integer.parseInt(getNumberOfDependents());

            Employee e = new Employee(monthlyIncome, numberOfDependent, name, age, address, phoneNumber, email);
            employeeList.getEmployeeList().add(e);

            double incomeTax = e.calculateIncomeTax();
            showInfoTxtArea.setText(buildTxtArea(name, age, monthlyIncome, numberOfDependent, incomeTax));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please check your numbers!");

        }
    }//GEN-LAST:event_calculateBtnActionPerformed

    private String buildTxtArea(String name, int age, long monthlyIncome, int numberOfDependent, double incomeTax) {
        return "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Monthly Income: " + monthlyIncome + "\n"
                + "Number Of Dependents: " + numberOfDependent + "\n"
                + "Income Tax: " + incomeTax + "\n";

    }

    private String getNumberOfDependents() {
        return numberOfDependentCmb.getSelectedItem().toString();
    }

    private boolean isFill() {
        return !(nameTxt.getText().trim().isEmpty()
                || ageTxt.getText().trim().isEmpty()
                || monthlyIncomeTxt.getText().trim().isEmpty()
                || addressTxt.getText().trim().isEmpty()
                || phoneNumberTxt.getText().trim().isEmpty()
                || emailTxt.getText().trim().isEmpty());
    }

    private void clearForm() {
        nameTxt.setText("");
        ageTxt.setText("");
        monthlyIncomeTxt.setText("");
        addressTxt.setText("");
        phoneNumberTxt.setText("");
        emailTxt.setText("");
        showInfoTxtArea.setText("");
        numberOfDependentCmb.setSelectedIndex(0);

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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel monthlyIncomeLabel;
    private javax.swing.JTextField monthlyIncomeTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox<String> numberOfDependentCmb;
    private javax.swing.JLabel numberOfDependentsLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTxt;
    private javax.swing.JTextArea showInfoTxtArea;
    // End of variables declaration//GEN-END:variables
}
