/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.observerpattern;

/**
 *
 * @author hanie
 */
public interface Stock {

    public void addObserver(Investor investor);

    public void removeObserver(Investor investor);

    public void notifyInvestors(double priceChange);
}
