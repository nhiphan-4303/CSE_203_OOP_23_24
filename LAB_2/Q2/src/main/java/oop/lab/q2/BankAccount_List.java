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
            int mAccnum = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the name: ");
            String mName = sc.nextLine();
            System.out.println("Enter the balance: ");
            double mBalance = sc.nextDouble();

            BankAccount b = new BankAccount(mAccnum, mName, mBalance);
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
        System.out.println("Enter the order account: ");
        int order = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        list.get(order - 1).deposit(money);
        System.out.println("-----Finish-----");
        System.out.println("Updated: ");
        System.out.println(list.get(order - 1).toString());
        System.out.println("___________________________");
    }

    public void outputWithDraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----WithDraw-----");
        System.out.println("Enter the order account: ");
        int order = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        if (list.get(order - 1).withdraw(money)) {
            System.out.println("-----Finish-----");
            System.out.println("Updated: ");
            System.out.println(list.get(order - 1).toString());
        } else {
            System.out.println("-----Impossible-----");
            System.out.println("Check the account balance again: ");
            System.out.println(list.get(order - 1).toString());
        }
        System.out.println("___________________________");
    }

    public void outputTransfer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Transfer-----");
        System.out.println("Enter the order of Transfer Account: ");
        int order1 = sc.nextInt();
        System.out.println("Enter the order of Received Account: ");
        int order2 = sc.nextInt();
        System.out.println("Enter amount of money: ");
        double money = sc.nextDouble();
        if (list.get(order1 - 1).transferMoney(list.get(order2 - 1), money)) {
            System.out.println("-----Finish-----");
            System.out.println("Updated: ");
            System.out.println(list.get(order1 - 1).toString());
            System.out.println(list.get(order2 - 1).toString());

        } else {
            System.out.println("-----Impossible-----");
            System.out.println("Check the account balance again: ");
            System.out.println(list.get(order1 - 1).toString());
        }
        System.out.println("___________________________");
    }

}
