/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop.lab.student_management;

import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

        JListStudent.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    int row = JListStudent.getSelectedRow();
                    if (row >= 0) { // Ensure a row is selected
                        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this student?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            String studentID = (String) JListStudent.getValueAt(row, 0);
                            Student student = studentManager.findStudentById(studentID);
                            if (student != null) {
                                studentManager.getListStudent().remove(student);
                                ((DefaultTableModel) JListStudent.getModel()).removeRow(row);
                                newStudentDialog.saveStudent(studentManager.getListStudent());

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: Student could not be found.");
                            }
                        }
                    }
                }
            }
        });
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
        jScrollPane = new javax.swing.JScrollPane();
        JListStudent = new javax.swing.JTable();

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
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 94, 0, 0);
        jPanel1.add(btnCheckTotalStudent, gridBagConstraints);

        btnNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNewStudent.setText("New Student");
        btnNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewStudentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 94, 0, 0);
        jPanel1.add(btnNewStudent, gridBagConstraints);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 94, 0, 0);
        jPanel1.add(btnRefresh, gridBagConstraints);

        JListStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Gender", "School Stage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane.setViewportView(JListStudent);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 553;
        gridBagConstraints.ipady = 538;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 98, 0, 28);
        jPanel1.add(jScrollPane, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        fillInStudentTable();
        newStudentDialog.loadStudent(studentManager.getListStudent());
    }//GEN-LAST:event_btnRefreshActionPerformed
    private void fillInStudentTable() {
        DefaultTableModel model = (DefaultTableModel) JListStudent.getModel();
        int rowCount = model.getRowCount();
        // Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // Add rows from the student list to the table model
        for (Student s : studentManager.getListStudent()) {
            Object[] row = new Object[]{
                s.getStudentID(),
                s.getFirstName(),
                s.getLastName(),
                s.getGender(),
                s.getSchoolStage()
            };
            model.addRow(row);
        }
        pack();
    }

    @SuppressWarnings("unchecked")
    private void btnCheckTotalStudentActionPerformed(java.awt.event.ActionEvent evt
    ) {// GEN-FIRST:event_btnCheckTotalStudentActionPerformed
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.dat"))) {

            studentManager.listStudent = (ArrayList<Student>) ois.readObject();
            int totalStudents = studentManager.getListStudent().size();
            JOptionPane.showMessageDialog(this, "There are " + totalStudents + " students in the database");

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading students from file.");
        }

    }// GEN-LAST:event_btnCheckTotalStudentActionPerformed

    private void btnNewStudentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNewStudentActionPerformed
        newStudentDialog.loadStudent(studentManager.getListStudent());
        new NewStudentDialog().setVisible(true);
    }// GEN-LAST:event_btnNewStudentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JListStudent;
    private javax.swing.JButton btnCheckTotalStudent;
    private javax.swing.JButton btnNewStudent;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables
}
