/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class BankAccount_List {

    ArrayList<BankAccount> list = new ArrayList<BankAccount>();

    public BankAccount_List() {
    }

    public BankAccount_List(ArrayList<BankAccount> list) {
        this.list = list;
    }

    public void inputListAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Accounts: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Account number: ");
            int mAccNum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String mName = sc.nextLine();
            System.out.println("Enter the balance: ");
            double mBalance = sc.nextDouble();

            BankAccount b = new BankAccount(mAccNum, mName, mBalance);
            list.add(b);
            System.out.println("___________________________");
        }
    }

    public void outputListAccount() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("___________________________");
        }
    }

    public void outputDeposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Deposit-----");
        System.out.println("Enter Number Account: ");
        int mAccNum = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        int order = 0;
        for (int i = 0; i < list.size(); i++) {
            if (mAccNum == list.get(i).getmAccNum()) {
                order = i;
            }
        }
        list.get(order).deposit(money);
        System.out.println("-----Finish-----");
        System.out.println("Updated: ");
        System.out.println(list.get(order).toString());
        System.out.println("___________________________");
    }

    public void outputWithDraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----WithDraw-----");
        System.out.println("Enter Number Account: ");
        int mAccNum = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        int order = 0;
        for (int i = 0; i < list.size(); i++) {
            if (mAccNum == list.get(i).getmAccNum()) {
                order = i;
            }
        }
        if (list.get(order).withdraw(money)) {
            System.out.println("-----Finish-----");
            System.out.println("Updated: ");
            System.out.println(list.get(order).toString());
        } else {
            System.out.println("-----Impossible-----");
            System.out.println("Check the account balance again: ");
            System.out.println(list.get(order).toString());
        }
        System.out.println("___________________________");
    }

    public void outputTransfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Transfer-----");
        System.out.println("Enter Number Account of Transfer Account: ");
        int mAccNum1 = sc.nextInt();
        System.out.println("Enter Number Account of Received Account: ");
        int mAccNum2 = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        int order1 = 0;
        int order2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (mAccNum1 == list.get(i).getmAccNum()) {
                order1 = i;
            }
            if (mAccNum2 == list.get(i).getmAccNum()) {
                order2 = i;
            }
        }
        if (list.get(order1).transferMoney(list.get(order2), money)) {
            System.out.println("-----Finish-----");
            System.out.println("Updated: ");
            System.out.println(list.get(order1).toString());
            System.out.println(list.get(order2).toString());

        } else {
            System.out.println("-----Impossible-----");
            System.out.println("Check the account balance again: ");
            System.out.println(list.get(order1).toString());
        }
        System.out.println("___________________________");
    }

}
