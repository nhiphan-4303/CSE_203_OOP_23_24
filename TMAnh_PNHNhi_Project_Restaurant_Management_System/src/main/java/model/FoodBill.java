/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hanie
 */
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FoodBill implements Serializable {

    private String foodName;
    private double price;
    private int orderQuantity;
    private double totalPrice;

    public FoodBill(String foodName, double price, int orderQuantity, double totalPrice) {
        this.foodName = foodName;
        this.price = price;
        this.orderQuantity = orderQuantity;
        this.totalPrice = totalPrice;
    }

    public FoodBill() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
