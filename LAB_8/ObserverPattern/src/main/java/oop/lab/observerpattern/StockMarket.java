/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.observerpattern;

/**
 *
 * @author hanie
 */
public class StockMarket {

    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APP", 100);
        Stock dellStock = new ConcreteStock("DeLL", 100);

        Investor tomInvestor = new SimpleInvestor("Tom");
        Investor bobInvestor = new SimpleInvestor("Bob");
        appleStock.addObserver(tomInvestor);
        appleStock.addObserver(bobInvestor);
        dellStock.addObserver(tomInvestor);

        appleStock.notifyInvestors(100);
        appleStock.notifyInvestors(40.0);
        appleStock.notifyInvestors(10.0);
        appleStock.notifyInvestors(5.0);
        dellStock.notifyInvestors(300.0);
        dellStock.notifyInvestors(200.0);
    }

}
