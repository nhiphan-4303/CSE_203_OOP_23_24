/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author hanie
 */
public class FoodItem implements Serializable {

    // thuộc tính
    private String foodId;
    private String foodName;
    private double price;
    private String foodType;
    private int quantity;

    public FoodItem(String foodId, String foodName, double price, String foodType, int quantity) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public FoodItem() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

// getter setter 
    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
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

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

// method tính giá từng món theo số lượng món ăn
    public double calculatePrice(int quantity) {
        return price * quantity;
    }

    // method trả về chuỗi kết quả
    @Override
    public String toString() {
        return "Food ID: " + foodId + ", Name: " + foodName + ", Price: " + price + ", Quantity " + quantity;
    }

}
