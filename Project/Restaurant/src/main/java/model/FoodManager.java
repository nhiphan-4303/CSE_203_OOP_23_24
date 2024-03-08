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

    private ArrayList<FoodItem> foodList = new ArrayList<FoodItem>();
    private ArrayList<FoodType> foodTypeList = new ArrayList<FoodType>();

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

    public ArrayList<FoodType> getFoodTypeList() {
        return foodTypeList;
    }

    public void setFoodTypeList(ArrayList<FoodType> foodTypeList) {
        this.foodTypeList = foodTypeList;
    }

    //method check exist id of type
    public boolean addFoodType(FoodType foT) {
        for (FoodType ft : foodTypeList) {
            if (ft.getFoodTypeId().equalsIgnoreCase(foT.getFoodTypeId())) {
                return false;
            }
        }
        return true;
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

    //method edit type
    public boolean editFoodType(FoodType foT) {
        for (FoodType ft : foodTypeList) {
            if (ft.getFoodTypeId().equalsIgnoreCase(foT.getFoodTypeId())) {
                return true;
            }
        }
        return false;
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

    //method delete type
    public boolean deleteFoodType(FoodType foT) {
        for (FoodType ft : foodTypeList) {
            if (ft.getFoodTypeId().equalsIgnoreCase(foT.getFoodTypeId())) {
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
