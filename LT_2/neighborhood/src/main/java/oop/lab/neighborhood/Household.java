/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.neighborhood;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Household {

    //Thuoc tinh
    String houseNumber;
//    int NumberOfMF;
//    Person [] memberOfFamily;
    ArrayList<Person> memberOfFamily = new ArrayList<Person>();

    //List
    //Phuong thuc
    //1. Khoi tao
    Household() {

    }

    //2. Phuong thuc khac
    void InputHousehold() {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number of family members: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Person p = new Person();
            p.InputPerson();
            memberOfFamily.add(p);
        }

    }

    void OutputHousehold() {
        for (int i = 0; i < memberOfFamily.size(); i++) {
            memberOfFamily.get(i).OutputPerson();
        }

    }

    int CountAgeOver60() {
        int count = 0;
        for (int i = 0; i < memberOfFamily.size(); i++) {
            if (memberOfFamily.get(i).GetAge() > 60) {
                count++;
            }
        }
        return count;

    }
}
