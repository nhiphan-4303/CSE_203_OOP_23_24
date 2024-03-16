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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        deletePop = new javax.swing.JMenuItem();
        editPop = new javax.swing.JMenuItem();
        jPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        foodIdJLabel = new javax.swing.JLabel();
        foodTypeJLabel = new javax.swing.JLabel();
        foodPriceJLabel = new javax.swing.JLabel();
        foodIdJTxt = new javax.swing.JTextField();
        foodPriceJTxt = new javax.swing.JTextField();
        foodTypeJTxt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        foodNameJLabel = new javax.swing.JLabel();
        foodNameJTxt = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityJTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        priceSort = new javax.swing.JComboBox<>();
        searchTxt = new javax.swing.JTextField();
        searchLabel = new javax.swing.JLabel();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodIdJLabel.setText("Food ID");

        foodTypeJLabel.setText("Food Type");

        foodPriceJLabel.setText("Food Price");

        foodIdJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodIdJTxtActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        foodNameJLabel.setText("Food Name");

        foodNameJTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodNameJTxtActionPerformed(evt);
            }
        });

        quantityLabel.setText("Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(216, 216, 216)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodIdJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodIdJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodNameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodTypeJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodTypeJLabel))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(foodPriceJLabel)
                            .addComponent(foodPriceJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(quantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addComponent(quantityJTxt))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(foodIdJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodIdJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodTypeJLabel)
                            .addComponent(foodPriceJLabel)
                            .addComponent(foodNameJLabel)
                            .addComponent(quantityLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(foodTypeJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodPriceJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodNameJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityJTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(saveBtn)
                    .addComponent(clearBtn))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        backBtn.setText("Back");

        priceSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "price decrease", "price increase", " " }));
        priceSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceSortActionPerformed(evt);
            }
        });

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

        searchLabel.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(priceSort, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchLabel)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(backBtn)
                        .addGap(225, 225, 225)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 506));

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
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> priceSort;
    private javax.swing.JTextField quantityJTxt;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField searchTxt;
    // End of variables declaration//GEN-END:variables
}
