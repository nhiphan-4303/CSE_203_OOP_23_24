/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanngochanhnhi_2131209002;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class EmployeeManageMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        EmployeeManageMain employeeList = new EmployeeManageMain();
        System.out.println("Enter the number of Employee: ");
        int numberOfEmployee = sc.nextInt();
        employeeList.inputList(numberOfEmployee);
        System.out.println("The total tax income of all Employee: ");
        System.out.println(employeeList.taxOfAll(numberOfEmployee));

    }

    private ArrayList<Employee> employeeList = new ArrayList<>();

    public EmployeeManageMain() {
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public double taxOfAll(int numberOfEmployee) {
        double taxOfAll = 0;
        for (Employee e : employeeList) {
            taxOfAll += e.calculateIncomeTax();
        }
        return taxOfAll;
    }

    public void inputList(int numberOfEmployee) {
        for (int i = 0; i < numberOfEmployee; i++) {
            Employee e = new Employee();
            e.input();
            employeeList.add(e);
        }
    }

}
