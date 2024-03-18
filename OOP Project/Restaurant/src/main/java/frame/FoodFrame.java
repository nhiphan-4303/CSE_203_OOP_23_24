package frame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.FoodItem;
import model.FoodManager;

/**
 *
 * @author hanie
 */
public class FoodFrame extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     */
    FoodItem foodItem = new FoodItem();
    FoodManager foodManager = new FoodManager();

    public FoodFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        loadFoods();
        fillInFoodTable();

        priceSort.addActionListener((ActionEvent event) -> {
            JComboBox<String> combo = (JComboBox<String>) event.getSource();
            String selectedSort = (String) combo.getSelectedItem();

            if ("price decrease".equals(selectedSort)) {
                foodManager.sort_by_price_descending();
            } else if ("price increase".equals(selectedSort)) {
                foodManager.sort_by_price_ascending();
            }
            // Now, update the table to reflect the sorted list
            fillInFoodTable(); // This method will read from the sorted list in foodManager and update the JTable
        });

    }

    public FoodFrame() {
    }

    public void saveFoods() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Foods.dat"))) {
            oos.writeObject(foodManager.getFoodList());
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPopupMenu1 = new javax.swing.JPopupMenu();
        deletePop = new javax.swing.JMenuItem();
        editPop = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        priceSort = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchTxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        foodIdJLabel = new javax.swing.JLabel();
        foodIdJTxt = new javax.swing.JTextField();
        foodNameJLabel = new javax.swing.JLabel();
        foodNameJTxt = new javax.swing.JTextField();
        foodTypeJLabel = new javax.swing.JLabel();
        foodTypeJTxt = new javax.swing.JTextField();
        foodPriceJLabel = new javax.swing.JLabel();
        foodPriceJTxt = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityJTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        deletePop.setText("Delete\n");
        deletePop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePopMouseClicked(evt);
            }
        });
        deletePop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePopActionPerformed(evt);
            }
        });
        jPopupMenu1.add(deletePop);

        editPop.setText("Edit");
        editPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPopActionPerformed(evt);
            }
        });
        jPopupMenu1.add(editPop);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel.setBackground(new java.awt.Color(185, 232, 218));
        jPanel.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(185, 232, 218));

        backBtn.setBackground(new java.awt.Color(0, 153, 153));
        backBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Food ID", "Food Name", "Food Type", "Food Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class
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

        priceSort.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        priceSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "price decrease", "price increase" }));
        priceSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSortActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(138, 138, 219));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 138, 219));
        jLabel1.setText("Search");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(138, 138, 219));
        jLabel2.setText("Sort");

        searchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtActionPerformed(evt);
            }
        });
        searchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backBtn))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(priceSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.ipady = 345;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 37, 0);
        jPanel.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(185, 232, 218));

        foodIdJLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        foodIdJLabel.setForeground(new java.awt.Color(139, 139, 221));
        foodIdJLabel.setText("Food ID");

        foodIdJTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 167, 136), 3, true));
        foodIdJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodIdJTxtActionPerformed(evt);
            }
        });

        foodNameJLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        foodNameJLabel.setForeground(new java.awt.Color(138, 138, 219));
        foodNameJLabel.setText("Food Name");

        foodNameJTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 167, 136), 3, true));
        foodNameJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameJTxtActionPerformed(evt);
            }
        });

        foodTypeJLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        foodTypeJLabel.setForeground(new java.awt.Color(138, 138, 219));
        foodTypeJLabel.setText("Food Type");

        foodTypeJTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 167, 136), 3, true));

        foodPriceJLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        foodPriceJLabel.setForeground(new java.awt.Color(138, 138, 219));
        foodPriceJLabel.setText("Food Price");

        foodPriceJTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 167, 136), 3, true));

        quantityLabel.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(138, 138, 219));
        quantityLabel.setText("Quantity");

        quantityJTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 167, 136), 3, true));

        jPanel1.setBackground(new java.awt.Color(185, 232, 218));

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 153, 153));
        saveBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(0, 153, 153));
        clearBtn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(foodIdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodTypeJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(foodPriceJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quantityJTxt)
                    .addComponent(foodPriceJTxt)
                    .addComponent(foodTypeJTxt)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodNameJTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(foodIdJTxt))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodIdJLabel)
                    .addComponent(foodIdJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodNameJLabel)
                    .addComponent(foodNameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodTypeJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodTypeJLabel))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodPriceJLabel)
                    .addComponent(foodPriceJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantityJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -19;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 12, 0, 8);
        jPanel.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTableMouseClicked
        if (evt.getClickCount() == 2) {
            jPopupMenu1.show(foodTable, evt.getX(), evt.getY() + (foodTable.getSelectedRow()) * 25);

        }
    }//GEN-LAST:event_foodTableMouseClicked

    private void deletePopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePopMouseClicked
    }//GEN-LAST:event_deletePopMouseClicked

    private void deletePopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePopActionPerformed

        int selectedRow = foodTable.getSelectedRow();
        if (selectedRow >= 0) { // Make sure a row is selected
            String foodId = (String) foodTable.getValueAt(selectedRow, 0); // Assuming the first column is the Food ID
            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to delete this food item?", "Delete Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                FoodItem item = foodManager.findFoodItemById(foodId);

                if (item != null) {
                    foodManager.getFoodList().remove(item);
                    ((DefaultTableModel) foodTable.getModel()).removeRow(selectedRow);
                    saveFoods();
                    JOptionPane.showMessageDialog(this, "Food item deleted successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: Food item not found.", "Deletion Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "No Selection",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deletePopActionPerformed

    private void editPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPopActionPerformed
        getDataFromTable();
    }//GEN-LAST:event_editPopActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int selectedRow = foodTable.getSelectedRow();

        if (selectedRow != -1) {
            FoodItem itemToEdit = foodManager.findFoodItemById(foodIdJTxt.getText());

            if (itemToEdit != null) {
                itemToEdit.setFoodName(foodNameJTxt.getText());
                itemToEdit.setFoodType(foodTypeJTxt.getText());
                try {
                    double price = Double.parseDouble(foodPriceJTxt.getText());
                    int quantity = Integer.parseInt(quantityJTxt.getText()); // Capture quantity from the UI

                    itemToEdit.setPrice(price);
                    itemToEdit.setQuantity(quantity); // Update the item's quantity

                    DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
                    model.setValueAt(itemToEdit.getFoodName(), selectedRow, 1);
                    model.setValueAt(itemToEdit.getFoodType(), selectedRow, 2);
                    model.setValueAt(itemToEdit.getPrice(), selectedRow, 3);
                    model.setValueAt(itemToEdit.getQuantity(), selectedRow, 4);

                    saveFoods(); // Save the updated list to file

                    JOptionPane.showMessageDialog(this, "Food item updated successfully.");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid format. Please enter valid numbers for price and quantity.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error: Food item not found.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No food item selected to edit.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void foodNameJTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodNameJTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodNameJTxtActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed
    private void getDataFromTable() {
        int selectedRow = foodTable.getSelectedRow();
        if (selectedRow != -1) {
            FoodItem fi = foodManager.getFoodList().get(selectedRow);

            foodIdJTxt.setText(fi.getFoodId());
            foodNameJTxt.setText(fi.getFoodName());
            foodTypeJTxt.setText(fi.getFoodType());
            foodPriceJTxt.setText(String.valueOf(fi.getPrice()));
            quantityJTxt.setText(String.valueOf(fi.getQuantity()));

            foodIdJTxt.setEditable(false);
        }
    }

    private void searchTxtKeyReleased(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_searchTxtKeyReleased

        String searchText = searchTxt.getText().toLowerCase();
        DefaultTableModel model = (DefaultTableModel) foodTable.getModel();
        model.setRowCount(0); // Clear the table before the search

        // Use a stream to filter the food list by name or type
        foodManager.getFoodList().stream()
                .filter(foodItem -> foodItem.getFoodName().toLowerCase().contains(searchText)
                || foodItem.getFoodType().toLowerCase().contains(searchText))
                .forEach(filteredFoodItem -> {
                    model.addRow(new Object[]{
                        filteredFoodItem.getFoodId(),
                        filteredFoodItem.getFoodName(),
                        filteredFoodItem.getFoodType(),
                        filteredFoodItem.getPrice(),
                        filteredFoodItem.getQuantity()
                    });
                });

    }// GEN-LAST:event_searchTxtKeyReleased

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed

    }// GEN-LAST:event_searchBtnActionPerformed

    private void searchTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchTxtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_searchTxtActionPerformed

    private void foodIdJTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_foodIdJTxtActionPerformed

    }// GEN-LAST:event_foodIdJTxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addBtnActionPerformed
        //DecimalFormat df = new DecimalFormat("#.###");
        String foodId = foodIdJTxt.getText();
        String foodName = foodNameJTxt.getText();
        String foodType = foodTypeJTxt.getText();
        String foodPriceText = foodPriceJTxt.getText();
        String quantityText = quantityJTxt.getText();

        if (foodId.isEmpty() || foodName.isEmpty() || foodType.isEmpty() || foodPriceText.isEmpty() || quantityText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please complete all information.", "Announcement", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                double foodPrice = Double.parseDouble(foodPriceText);
                int quantity = Integer.parseInt(quantityText);
                FoodItem fi = new FoodItem(foodId, foodName, foodPrice, foodType, quantity);

                if (foodManager.addFoodItem(fi)) {
                    foodManager.getFoodList().add(fi);
                    JOptionPane.showMessageDialog(this, "Add successful.");
                    saveFoods();
                } else {
                    JOptionPane.showMessageDialog(this, "This ID existed !");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Food Price and Quantity must be numbers.", "Invalid Input",
                        JOptionPane.ERROR_MESSAGE);
            }
            loadFoods();
            fillInFoodTable();

        }// GEN-LAST:event_addBtnActionPerformed
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
                fi.getPrice(),
                fi.getQuantity()
            };
            model.addRow(row);
        }
        pack();
    }

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearBtnActionPerformed
        foodIdJTxt.setText(" ");
        foodNameJTxt.setText(" ");
        foodTypeJTxt.setText(" ");
        foodPriceJTxt.setText(" ");
        quantityJTxt.setText(" ");
    }// GEN-LAST:event_clearBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_refreshBtnActionPerformed
        loadFoods();
        fillInFoodTable();
    }// GEN-LAST:event_refreshBtnActionPerformed

    private void priceSortActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_priceSortActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_priceSortActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_editBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            FoodFrame dialog = new FoodFrame(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JMenuItem deletePop;
    private javax.swing.JMenuItem editPop;
    private javax.swing.JLabel foodIdJLabel;
    private javax.swing.JTextField foodIdJTxt;
    private javax.swing.JLabel foodNameJLabel;
    private javax.swing.JTextField foodNameJTxt;
    private javax.swing.JLabel foodPriceJLabel;
    private javax.swing.JTextField foodPriceJTxt;
    private javax.swing.JTable foodTable;
    private javax.swing.JLabel foodTypeJLabel;
    private javax.swing.JTextField foodTypeJTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> priceSort;
    private javax.swing.JTextField quantityJTxt;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
