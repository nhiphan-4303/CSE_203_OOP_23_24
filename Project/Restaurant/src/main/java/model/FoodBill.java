/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hanie
 */
import java.time.LocalDateTime;
import java.util.List;

public class FoodBill {

    private String titlePrintBill;
    private float total;
    private float price;
    private int quantityBill;

    public FoodBill(String titlePrintBill) {
        this.titlePrintBill = titlePrintBill;
        this.total = 0;
        this.price = 0;
        this.quantityBill = 0;
    }

    // Method to add an item to the bill
    public void addItemToBill(float price, int quantity) {
        this.price = price; // Assuming this is the price per item
        this.quantityBill += quantity; // Add the quantity of this item to the total bill quantity
        this.total += price * quantity; // Add the price for this item (price * quantity) to the total
    }

    // Getters and Setters
    public String getTitlePrintBill() {
        return titlePrintBill;
    }

    public void setTitlePrintBill(String titlePrintBill) {
        this.titlePrintBill = titlePrintBill;
    }

    public float getTotal() {
        return total;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price; // Note: This would set the price per item for future additions
    }

    public int getQuantityBill() {
        return quantityBill;
    }

    public String printBill() {
        return String.format("%s\nTotal Items: %d\nTotal: $%.2f",
                titlePrintBill, quantityBill, total);
    }
}
