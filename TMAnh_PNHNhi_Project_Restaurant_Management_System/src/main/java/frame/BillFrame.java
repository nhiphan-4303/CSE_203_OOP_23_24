/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package frame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.FoodBill;
import model.FoodItem;
import model.FoodManager;
import model.MainBill;
import model.ManageCustomer;
import model.ManageFoodBill;
import model.ManageMainBill;

/**
 *
 * @author hanie
 */
public class BillFrame extends javax.swing.JDialog {

    /**
     * Creates new form BillFrame
     */
    private FoodManager foodManager = new FoodManager();
    private ManageCustomer manageCustomer = new ManageCustomer();
    private ManageFoodBill manageFoodBill = new ManageFoodBill();
    private FoodBill foodBill = new FoodBill();
    private MainBill mainBill = new MainBill();
    private ManageMainBill manageMainBill = new ManageMainBill();

    public BillFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        new MainForm().setVisible(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        loadBills();
        loadFoods();
        fillInFoodTable();

        loadCustomers();
        setIdComboBox();

        clearBill();

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

        jPanel1 = new javax.swing.JPanel();
        customersPanel1 = new javax.swing.JPanel();
        customersContentLabel1 = new javax.swing.JLabel();
        customersIDLabel = new javax.swing.JLabel();
        customersNameLabel = new javax.swing.JLabel();
        customersNameTextField = new javax.swing.JTextField();
        idComboBox = new javax.swing.JComboBox<>();
        backButton1 = new javax.swing.JButton();
        productsPanel = new javax.swing.JPanel();
        foodContentLabel = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();
        foodNameTextField = new javax.swing.JTextField();
        foodPriceLabel = new javax.swing.JLabel();
        foodPriceTextField = new javax.swing.JTextField();
        foodQuantityLabel = new javax.swing.JLabel();
        foodQuantityTextField = new javax.swing.JTextField();
        addBillButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        foodListPanel1 = new javax.swing.JPanel();
        foodListLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        billTxtArea = new javax.swing.JTextArea();
        productBillPanel = new javax.swing.JPanel();
        productsBillLabel = new javax.swing.JLabel();
        proBillTable = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        amountLabel = new javax.swing.JLabel();
        resetBillBtn = new javax.swing.JButton();
        foodListLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bill Frame");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(189, 237, 222));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        customersPanel1.setBackground(new java.awt.Color(189, 239, 226));
        customersPanel1.setForeground(new java.awt.Color(190, 242, 229));
        customersPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customersContentLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 22)); // NOI18N
        customersContentLabel1.setForeground(new java.awt.Color(140, 140, 226));
        customersContentLabel1.setText("Customers");
        customersPanel1.add(customersContentLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 10, -1, -1));

        customersIDLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        customersIDLabel.setForeground(new java.awt.Color(139, 139, 227));
        customersIDLabel.setText("ID");
        customersPanel1.add(customersIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 48, 22, -1));

        customersNameLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        customersNameLabel.setForeground(new java.awt.Color(140, 140, 226));
        customersNameLabel.setText("Name");
        customersPanel1.add(customersNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 48, -1, 16));

        customersNameTextField.setEditable(false);
        customersNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersNameTextFieldActionPerformed(evt);
            }
        });
        customersPanel1.add(customersNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 70, 120, -1));

        idComboBox.setEditable(true);
        idComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idComboBoxItemStateChanged(evt);
            }
        });
        idComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idComboBoxMouseClicked(evt);
            }
        });
        idComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboBoxActionPerformed(evt);
            }
        });
        customersPanel1.add(idComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 74, 98, -1));

        backButton1.setBackground(new java.awt.Color(183, 229, 215));
        backButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backButton1.setForeground(new java.awt.Color(255, 255, 255));
        backButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\backicon.png")); // NOI18N
        backButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        customersPanel1.add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 62, -1));

        productsPanel.setBackground(new java.awt.Color(189, 237, 224));
        productsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodContentLabel.setFont(new java.awt.Font("Bernard MT Condensed", 1, 22)); // NOI18N
        foodContentLabel.setForeground(new java.awt.Color(139, 139, 224));
        foodContentLabel.setText("Food");
        productsPanel.add(foodContentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 25));

        foodNameLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        foodNameLabel.setForeground(new java.awt.Color(139, 139, 224));
        foodNameLabel.setText("Name");
        productsPanel.add(foodNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, -1));

        foodNameTextField.setEditable(false);
        foodNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameTextFieldActionPerformed(evt);
            }
        });
        productsPanel.add(foodNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        foodPriceLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        foodPriceLabel.setForeground(new java.awt.Color(139, 139, 224));
        foodPriceLabel.setText("Price");
        productsPanel.add(foodPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 34, 46, 16));

        foodPriceTextField.setEditable(false);
        foodPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodPriceTextFieldActionPerformed(evt);
            }
        });
        productsPanel.add(foodPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 93, -1));

        foodQuantityLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        foodQuantityLabel.setForeground(new java.awt.Color(139, 139, 224));
        foodQuantityLabel.setText("Quantity");
        productsPanel.add(foodQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 32, -1, -1));

        foodQuantityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodQuantityTextFieldActionPerformed(evt);
            }
        });
        productsPanel.add(foodQuantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 90, -1));

        addBillButton.setBackground(new java.awt.Color(187, 234, 221));
        addBillButton.setFont(new java.awt.Font("VNI-Avo", 1, 14)); // NOI18N
        addBillButton.setForeground(new java.awt.Color(255, 255, 255));
        addBillButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\addbutton.png")); // NOI18N
        addBillButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addBillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBillButtonActionPerformed(evt);
            }
        });
        productsPanel.add(addBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 61, -1));

        resetButton.setBackground(new java.awt.Color(187, 234, 221));
        resetButton.setFont(new java.awt.Font("VNI-Avo", 1, 14)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\clear.png")); // NOI18N
        resetButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        productsPanel.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 62, -1));

        foodListPanel1.setBackground(new java.awt.Color(187, 234, 221));
        foodListPanel1.setForeground(new java.awt.Color(0, 204, 153));

        foodListLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 1, 22)); // NOI18N
        foodListLabel1.setForeground(new java.awt.Color(139, 139, 221));
        foodListLabel1.setText("Menu");

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Food ID", "Food Name", "Food Type", "Food Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        foodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(foodTable);

        javax.swing.GroupLayout foodListPanel1Layout = new javax.swing.GroupLayout(foodListPanel1);
        foodListPanel1.setLayout(foodListPanel1Layout);
        foodListPanel1Layout.setHorizontalGroup(
            foodListPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodListPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(foodListPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(foodListLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        foodListPanel1Layout.setVerticalGroup(
            foodListPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodListPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foodListLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(187, 234, 221));

        billTxtArea.setBackground(new java.awt.Color(232, 228, 228));
        billTxtArea.setColumns(20);
        billTxtArea.setRows(5);
        jScrollPane2.setViewportView(billTxtArea);

        productBillPanel.setBackground(new java.awt.Color(187, 234, 221));
        productBillPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productsBillLabel.setFont(new java.awt.Font("Bernard MT Condensed", 1, 22)); // NOI18N
        productsBillLabel.setForeground(new java.awt.Color(139, 139, 221));
        productsBillLabel.setText("Product  Bill");
        productBillPanel.add(productsBillLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 6, -1, -1));

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        billTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proBillTable.setViewportView(billTable);

        productBillPanel.add(proBillTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 362, 160));

        printButton.setBackground(new java.awt.Color(187, 234, 221));
        printButton.setFont(new java.awt.Font("VNI-Avo", 1, 14)); // NOI18N
        printButton.setForeground(new java.awt.Color(255, 255, 255));
        printButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\print.png")); // NOI18N
        printButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        productBillPanel.add(printButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 62, -1));

        removeButton.setBackground(new java.awt.Color(187, 234, 221));
        removeButton.setFont(new java.awt.Font("VNI-Avo", 1, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\3687412.png")); // NOI18N
        removeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        productBillPanel.add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 217, 62, -1));

        amountLabel.setBackground(new java.awt.Color(0, 153, 255));
        amountLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        productBillPanel.add(amountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 259, 110, 37));

        resetBillBtn.setBackground(new java.awt.Color(187, 234, 221));
        resetBillBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBillBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\hanie\\OneDrive\\Desktop\\Ky-thuat-phan-mem\\CSE_203_OOP_23_24\\TMAnh_PNHNhi_Project_Restaurant_Management_System\\src\\main\\java\\image\\clear.png")); // NOI18N
        resetBillBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBillBtnActionPerformed(evt);
            }
        });
        productBillPanel.add(resetBillBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 217, 62, -1));

        foodListLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 1, 22)); // NOI18N
        foodListLabel2.setForeground(new java.awt.Color(138, 138, 219));
        foodListLabel2.setText("Export  Bill");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productBillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(foodListLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(productBillPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodListLabel2)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(productsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodListPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customersPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(customersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(productsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodListPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -233;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customersNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersNameTextFieldActionPerformed
        showNameBill();
    }//GEN-LAST:event_customersNameTextFieldActionPerformed

    private void idComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idComboBoxItemStateChanged

    }//GEN-LAST:event_idComboBoxItemStateChanged

    private void idComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idComboBoxMouseClicked

    }//GEN-LAST:event_idComboBoxMouseClicked

    private void idComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboBoxActionPerformed
        showNameBill();
    }//GEN-LAST:event_idComboBoxActionPerformed

    private void foodPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodPriceTextFieldActionPerformed

    private void addBillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBillButtonActionPerformed
        int selectedRow = foodTable.getSelectedRow();
        if (selectedRow != -1) {
            try {
                int foodQuantity = Integer.parseInt(foodQuantityTextField.getText());
                fillInBillTable(selectedRow, foodQuantity);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter quantity as a valid integer.");
            }
        }
    }//GEN-LAST:event_addBillButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        foodNameTextField.setText("");
        foodPriceTextField.setText("");
        foodQuantityTextField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void foodNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodNameTextFieldActionPerformed

    private void foodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTableMouseClicked
        getDataFromTable();
    }//GEN-LAST:event_foodTableMouseClicked

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedRow = billTable.getSelectedRow();
        if (selectedRow >= 0) {
            DefaultTableModel model = (DefaultTableModel) billTable.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select an item to remove.");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        fillInBill();
    }//GEN-LAST:event_printButtonActionPerformed

    private void resetBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBillBtnActionPerformed
        clearBill();
    }//GEN-LAST:event_resetBillBtnActionPerformed

    private void foodQuantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodQuantityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodQuantityTextFieldActionPerformed

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backButton1ActionPerformed
    private void saveCustomers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Customers.Dat"))) {
            oos.writeObject(manageCustomer.getListCustomer());
            //JOptionPane.showMessageDialog(this, "Customers saved successfully!");
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

    public void saveBills() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Bills.dat"))) {
            oos.writeObject(manageMainBill.getListMainBills());
            JOptionPane.showMessageDialog(this, "Bills saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving bill to file: " + e.getMessage());
        }
    }

    public void loadBills() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Bills.dat"))) {
            manageMainBill.setListMainBills((ArrayList<MainBill>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading Bills from file.");
        }
    }

    public void saveFoods() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Foods.dat"))) {
            oos.writeObject(foodManager.getFoodList()); // Save only the ArrayList<CD>
            //JOptionPane.showMessageDialog(this, "Foods saved successfully!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving Foods to file: " + e.getMessage());
        }
    }

    public void loadFoods() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Foods.dat"))) {
            foodManager.setFoodList((ArrayList<FoodItem>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading Foods from file.");
        }
    }

    private void fillInFoodTable() {
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        int rowCount = model.getRowCount();
        // Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        // Add rows from the student list to the table model
        for (FoodItem fi : foodManager.getFoodList()) {
            Object[] row = new Object[]{
                fi.getFoodId(),
                fi.getFoodName(),
                fi.getFoodType(),
                fi.getPrice()
            };
            model.addRow(row);
        }
        pack();
    }

    public void showNameBill() {
        String id = String.valueOf(idComboBox.getSelectedItem());
        Customer cus = manageCustomer.findCustomer(id);
        if (cus != null) {
            customersNameTextField.setText(cus.getCustomerName());
        } else {
            customersNameTextField.setText("");
        }
    }

    public void setIdComboBox() {
        idComboBox.removeAllItems();
        for (Customer cus : manageCustomer.getListCustomer()) {
            idComboBox.addItem(String.valueOf(cus.getCustomerID()));
        }
    }

    private void getDataFromTable() {
        int selectedRow = foodTable.getSelectedRow();
        if (selectedRow != -1) {
            FoodItem fi = foodManager.getFoodList().get(selectedRow);

            foodNameTextField.setText(fi.getFoodName());
            foodPriceTextField.setText(String.valueOf(fi.getPrice()));

            foodNameTextField.setEditable(false);
            foodPriceTextField.setEditable(false);
        }
    }

    private void fillInBillTable(int selectedRow, int foodQuantity) {
        FoodItem fi = foodManager.getFoodList().get(selectedRow);
        String foodName = fi.getFoodName();
        double foodPrice = fi.getPrice();
        double totalPrice;

        if (foodQuantity <= 0 || foodQuantity > fi.getQuantity()) {
            JOptionPane.showMessageDialog(this, "Not enough quantity to supply. Quantity currently available: " + fi.getQuantity());
            return;
        }

        totalPrice = foodPrice * foodQuantity;

        FoodBill fooBi = new FoodBill(foodName, foodPrice, foodQuantity, totalPrice);
        manageFoodBill.getBills().add(fooBi);

        // Trừ số lượng và cập nhật vào FoodManager
        fi.setQuantity(fi.getQuantity() - foodQuantity);
        saveFoods();

        // Thêm vào bảng hóa đơn
        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        model.addRow(new Object[]{foodName, foodPrice, foodQuantity, totalPrice});
    }

    public void fillInBill() {
        try {
            DecimalFormat df = new DecimalFormat("#,##0.00");
            LocalDateTime dateTime = LocalDateTime.now();
            String customerId = idComboBox.getSelectedItem().toString();
            String customerName = customersNameTextField.getText();
            ArrayList<FoodBill> items = manageFoodBill.getBills();
            float grandTotal = 0;

            for (FoodBill item : items) {
                grandTotal += item.getTotalPrice();
            }

            MainBill mBill = new MainBill(dateTime, customerId, customerName, items, grandTotal);

            String billText = mBill.generateBillText(df);
            billTxtArea.setText(billText);

            manageMainBill.getListMainBills().add(mBill);

            saveBills();

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "An error occurred due to null data: " + e.getMessage(), "Data Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearBill() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String header = "\t" + dateFormat.format(date) + "\n"
                + "===============ANNA RESTAURANT=================\n"
                + "Food Name\tQuantity\tPrice\tTotal Price\n"
                + "--------------------------------------------------\n";

        billTxtArea.setText(header);

        customersNameTextField.setText("");
        idComboBox.setSelectedIndex(-1);

        manageFoodBill.getBills().clear();

        DefaultTableModel model = (DefaultTableModel) billTable.getModel();
        model.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBillButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton1;
    private javax.swing.JTable billTable;
    private javax.swing.JTextArea billTxtArea;
    private javax.swing.JLabel customersContentLabel1;
    private javax.swing.JLabel customersIDLabel;
    private javax.swing.JLabel customersNameLabel;
    private javax.swing.JTextField customersNameTextField;
    private javax.swing.JPanel customersPanel1;
    private javax.swing.JLabel foodContentLabel;
    private javax.swing.JLabel foodListLabel1;
    private javax.swing.JLabel foodListLabel2;
    private javax.swing.JPanel foodListPanel1;
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JTextField foodNameTextField;
    private javax.swing.JLabel foodPriceLabel;
    private javax.swing.JTextField foodPriceTextField;
    private javax.swing.JLabel foodQuantityLabel;
    private javax.swing.JTextField foodQuantityTextField;
    private javax.swing.JTable foodTable;
    private javax.swing.JComboBox<String> idComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printButton;
    private javax.swing.JScrollPane proBillTable;
    private javax.swing.JPanel productBillPanel;
    private javax.swing.JLabel productsBillLabel;
    private javax.swing.JPanel productsPanel;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton resetBillBtn;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables

}
