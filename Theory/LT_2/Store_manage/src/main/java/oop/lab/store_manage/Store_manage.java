/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.store_manage;

/**
 *
 * @author hanie
 */
public class Store_manage {

    public static void main(String[] args) {
        List_Product listP = new List_Product();

        listP.inputListProduct();
        listP.outputListProduct();
        listP.outputPriceLess100();
        listP.sortDate();
        listP.outputListProduct();

    }
}
