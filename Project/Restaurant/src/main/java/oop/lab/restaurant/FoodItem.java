/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.restaurant;

/**
 *
 * @author hanie
 */
public class FoodItem {

    // thuộc tính
    private String foodId;
    private String foodName;
    private double price;
    private FoodType foodType;

    // constructor
    public FoodItem() {
    }

    public FoodItem(String foodId, String foodName, double price, FoodType foodType) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.foodType = foodType;
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

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

// method tính giá từng món theo số lượng món ăn
    public double calculatePrice(int quantity) {
        return price * quantity;
    }

    // method trả về chuỗi kết quả
    @Override
    public String toString() {
        return "Food ID: " + foodId + ", Name: " + foodName + ", Price: " + price;
    }

}
