/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop.lab.student_management;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hanie
 */
public class MainFrame extends javax.swing.JFrame {

    private StudentManager studentManager = new StudentManager();
    private NewStudentDialog newStudentDialog = new NewStudentDialog();

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);

        newStudentDialog.loadStudent(studentManager.getListStudent());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnCheckTotalStudent = new javax.swing.JButton();
        btnNewStudent = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnCheckTotalStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCheckTotalStudent.setText("Check Total Student");
        btnCheckTotalStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckTotalStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 71, 0, 0);
        jPanel1.add(btnCheckTotalStudent, gridBagConstraints);

        btnNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewStudent.setText("New Student");
        btnNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 84, 348, 0);
        jPanel1.add(btnNewStudent, gridBagConstraints);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 137;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 79, 348, 66);
        jPanel1.add(btnRefresh, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    @SuppressWarnings("unchecked")
    private void btnCheckTotalStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCheckTotalStudentActionPerformed
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.dat"))) {
            
            studentManager.listStudent = (ArrayList<Student>) ois.readObject();
            int totalStudents = studentManager.getListStudent().size();
            JOptionPane.showMessageDialog(this, "There are " + totalStudents + " students in the database");

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading students from file.");
        }

    }// GEN-LAST:event_btnCheckTotalStudentActionPerformed

    private void btnNewStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNewStudentActionPerformed
        new NewStudentDialog().setVisible(true);
    }// GEN-LAST:event_btnNewStudentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckTotalStudent;
    private javax.swing.JButton btnNewStudent;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
