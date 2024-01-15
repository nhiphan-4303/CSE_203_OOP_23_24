/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.q2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class BankAccount_Manage {

    public static void main(String[] args) {

        BankAccount_List listAccount = new BankAccount_List();
        listAccount.inputListAccount();
        listAccount.outputListAccount();
        listAccount.outputDeposit();
        listAccount.outputWithDraw();
        listAccount.outputTransfer();

    }
}
