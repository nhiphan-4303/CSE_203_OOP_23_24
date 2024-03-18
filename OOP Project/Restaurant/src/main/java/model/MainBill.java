/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author hanie
 */
public class MainBill implements Serializable {

    private LocalDateTime dateTime;
    private String customerId;
    private String customerName;
    private ArrayList<FoodBill> items;
    private float grandTotal;

    public MainBill() {
    }

    public MainBill(LocalDateTime dateTime, String customerId, String customerName, ArrayList<FoodBill> items, float grandTotal) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.customerName = customerName;
        this.items = items;
        this.grandTotal = grandTotal;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<FoodBill> getItems() {
        return items;
    }

    public void setItems(ArrayList<FoodBill> items) {
        this.items = items;
    }

    public float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(float grandTotal) {
        this.grandTotal = grandTotal;
    }

    private float calculateGrandTotal() {
        float total = 0;
        for (FoodBill item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public String generateBillText(DecimalFormat df) {
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Header
        sb.append("Time: ").append(formatter.format(dateTime)).append("\n");
        sb.append("Customer ID: ").append(customerId).append("\n");
        sb.append("Customer Name: ").append(customerName).append("\n");
        sb.append("\nFood Name\tQuantity\tPrice\tTotal Price\n");
        sb.append("--------------------------------------------------\n");

        // Items
        for (FoodBill fb : items) {
            sb.append(fb.getFoodName()).append("\t")
                    .append(fb.getOrderQuantity()).append("\t")
                    .append(df.format(fb.getPrice())).append("\t")
                    .append(df.format(fb.getTotalPrice())).append("\n");
        }

        // Footer
        sb.append("--------------------------------------------------\n");
        sb.append("\nGrand Total: ").append(df.format(grandTotal));

        return sb.toString();
    }
    
    

}
