/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.q2_lab4;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Client {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // BankType type1 = BankType.TPBANK;
        // BankType type2 = BankType.VietcomBank;

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        BankType type;
        if (input.equalsIgnoreCase("TPBANK")) {
            type = BankType.TPBANK;
        } else if (input.equalsIgnoreCase("VietcomBank")) {
            type = BankType.VietcomBank;
        } else {
            System.out.println("No type matching with your input");
            return;
        }

        Bank bank = BankFactory.getBank(type);

        System.out.println(bank.getBankName());
    }
}
