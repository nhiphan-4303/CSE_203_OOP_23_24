/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.neighborhood;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Neighborhood {

    public static void main(String[] args) {
//        Person person1 = new Person();
//        person1.InputPerson();
//        Person person2 = new Person("Nguyen Van", "B", 20, "CNTT", "12345");
//       
//
//        person1.OutputPerson();
//        person2.OutputPerson();
//        Household house = new Household();
//        house.InputHousehold();
//        house.OutputHousehold();
//        house.CountAgeOver60();
//        System.out.println("Include " + house.CountAgeOver60() + " over 60.");
//
        Neighborhood neighborhood = new Neighborhood();
        neighborhood.InputNeighborhood();
        neighborhood.OutputNeighborhood();

    }
    //thuoc tinh 
    ArrayList<Household> house = new ArrayList<Household>();

    //phuong thuc 
    Neighborhood() {

    }

    void InputNeighborhood() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Number: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Household p = new Household();
            p.InputHousehold();
            house.add(p);
        }
    }

    void OutputNeighborhood() {
        for (int i = 0; i < house.size(); i++) {
            house.get(i).OutputHousehold();
        }
    }

}
