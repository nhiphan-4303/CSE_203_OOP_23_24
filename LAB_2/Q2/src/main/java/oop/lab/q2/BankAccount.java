/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q2;

import java.util.*;

/**
 *
 * @author hanie
 */
public class BankAccount {
    static Scanner sc = new Scanner(System.in);

    private int mAccNum;
    private String mName;
    private double mBalance;
    
    public int getmAccNum() {
        return mAccNum;
    }

    public String getmName() {
        return mName;
    }

    public double getmBalance() {
        return mBalance;
    }

    BankAccount() {
    }

    public BankAccount(int mAccNum, String mName, double mBalance) {
        this.mAccNum = mAccNum;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public void input() {
        System.out.println("Enter the number Account: ");
        mAccNum = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        mName = sc.nextLine();
        System.out.println("Enter Balance: ");
        mBalance = sc.nextDouble();
        System.out.println("_______________________________________");
    }

    public void deposit(double money) {
        mBalance += money;
    }

    public boolean withdraw(double money) {
        if (money <= mBalance) {
            mBalance -= money;
            return true;
        } else {
            return false;
        }

    }

    public boolean transferMoney(BankAccount acc, double money) {
        if (mBalance < money) {
            return false;
        } else {
            acc.mBalance += money;
            mBalance -= money;
            return true;
        }
    }

    public void print() {
        System.out.println("Number Account: " + mAccNum);
        System.out.println("Name: " + mName);
        System.out.println("Balance: " + mBalance);

    }

    public String toString() {
        return "Number Account: " + mAccNum + ", " + "Name: " + mName + ", " + "Balance: " + mBalance;
    }

}
