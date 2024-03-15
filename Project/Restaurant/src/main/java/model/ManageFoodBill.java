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
public class ManageFoodBill {

    public ManageFoodBill() {
    }

    private ArrayList<FoodBill> bills = new ArrayList<>();

    public ArrayList<FoodBill> getBills() {
        return bills;
    }

    public void setBills(ArrayList<FoodBill> bills) {
        this.bills = bills;
    }

}
