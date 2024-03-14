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

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FoodBill {

    private Customer customer; // Assuming a Customer class is already defined
    private List<FoodItem> foodItems;
    private LocalDateTime issueTime;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    public LocalDateTime getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

    public FoodBill(Customer customer, List<FoodItem> foodItems, LocalDateTime issueTime) {
        this.customer = customer;
        this.foodItems = foodItems;
        this.issueTime = issueTime;
    }

    public FoodBill() {
    }

    public int calculateTotalQuantity(int quantity) {
        int totalQuantity = 0;
        return totalQuantity += quantity;
    }

    // Calculate total price of all food items
    public double calculateTotalPrice(int quantity) {
        double totalPrice = 0.0;
        for (FoodItem item : foodItems) {
            // Assuming that each FoodItem has a method getPrice to return the price of the item
            totalPrice += item.calculatePrice(quantity);
        }
        return totalPrice;
    }

}
