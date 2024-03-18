/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author hanie
 */
public class ManageMainBill {

    private ArrayList<MainBill> listMainBills = new ArrayList<>();
    private ArrayList<LocalDateTime> allDates=new ArrayList<>();

    public ManageMainBill() {
    }

    public ArrayList<MainBill> getListMainBills() {
        return listMainBills;
    }

    public void setListMainBills(ArrayList<MainBill> listMainBills) {
        this.listMainBills = listMainBills;
    }
    
    public MainBill findMainBillByDate(LocalDateTime date) {
        for (MainBill m : listMainBills) {
            if (m.getDateTime().equals(date)) {
                return m;
            }
        }
        return null;
    }
    
    public ArrayList<LocalDateTime> getAllDates(){
        for(MainBill m: listMainBills){
            allDates.add(m.getDateTime());
        }
        return allDates;
    }

}
