/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hanie
 */
public class FoodManager {

    private ArrayList<FoodItem> foodList = new ArrayList<>();

    // constructor
    public FoodManager() {
    }

    //getter setter
    public ArrayList<FoodItem> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<FoodItem> foodList) {
        this.foodList = foodList;
    }

    //method check exist id of food
    public boolean addFoodItem(FoodItem foI) {
        for (FoodItem fi : foodList) {
            if (fi.getFoodId().equalsIgnoreCase(foI.getFoodId())) {
                return false;
            }
        }
        return true;
    }

    //method edit food
    public boolean editFoodItem(FoodItem foI) {
        for (FoodItem fi : foodList) {
            if (fi.getFoodId().equalsIgnoreCase(foI.getFoodId())) {
                return true;
            }
        }
        return false;
    }

    //method delete food
    public boolean deleteFoodItem(FoodItem foI) {
        for (FoodItem fi : foodList) {
            if (fi.getFoodId().equalsIgnoreCase(foI.getFoodId())) {
                return true;
            }
        }
        return false;
    }

    //method find food by ID
    public FoodItem findFoodItemById(String id) {
        for (FoodItem fi : foodList) {
            if (fi.getFoodId().equalsIgnoreCase(id)) {
                return fi;
            }
        }
        return null;
    }

    //method find food by name
    public FoodItem findFoodItemByName(String name) {
        for (FoodItem fi : foodList) {
            if (fi.getFoodName().equalsIgnoreCase(name)) {
                return fi;
            }
        }
        return null;
    }

}
