/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.q3;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Employee_Salary_Manage {

    public static void main(String[] args) {

        Employee_List list = new Employee_List();
        list.inputList();
        list.outputList();
        System.out.println("The highest salary: ");
        list.highestSalary();
        System.out.println("The decrease salary list: ");
        list.outputList();

    }
}
