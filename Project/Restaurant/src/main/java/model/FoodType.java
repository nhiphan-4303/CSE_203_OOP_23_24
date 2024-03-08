/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package model;

/**
 *
 * @author hanie
 */
public class FoodType {

    // thuộc tính
    private String foodTypeId;
    private String foodTypeName;

    //constructor
    public FoodType() {
    }

    public FoodType(String foodTypeId, String foodTypeName) {
        this.foodTypeId = foodTypeId;
        this.foodTypeName = foodTypeName;
    }

    //getter setter
    public void setFoodTypeId(String foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public void setFoodTypeName(String foodTypeName) {
        this.foodTypeName = foodTypeName;
    }

    public String getFoodTypeId() {
        return foodTypeId;
    }

    public String getFoodTypeName() {
        return foodTypeName;
    }
//trả về chuỗi kết quả 

    @Override
    public String toString() {
        return "Food Type ID: " + foodTypeId + ", Name: " + foodTypeName;
    }

}
