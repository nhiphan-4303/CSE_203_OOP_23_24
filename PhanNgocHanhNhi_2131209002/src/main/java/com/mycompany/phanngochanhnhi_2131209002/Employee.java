/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.phanngochanhnhi_2131209002;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Employee extends Person {

    private long monthlyIncome;
    private int numberOfDependents;

    public Employee(long monthlyIncome, int numberOfDependents) {
        this.monthlyIncome = monthlyIncome;
        this.numberOfDependents = numberOfDependents;
    }

    public Employee(long monthlyIncome, int numberOfDependents, String name, int age, String address, String phoneNumber, String email) {
        super(name, age, address, phoneNumber, email);
        this.monthlyIncome = monthlyIncome;
        this.numberOfDependents = numberOfDependents;
    }

    public Employee() {
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(long monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependent(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Enter the monthly income: ");
        monthlyIncome = sc.nextLong();
        System.out.println("Enter the number of dependents: ");
        numberOfDependents = sc.nextInt();
        sc.nextLine();
    }

    public double calculateIncomeTax() {
        double tax = 0;
        int M = 1000000;
        
        monthlyIncome-=4400000 * numberOfDependents;

        double[] levels = {0, 5 * M, 10 * M, 18 * M, 32 * M, 52 * M, 80 * M, Double.MAX_VALUE};
        double[] rates = {0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35};

        for (int i = 1; i < levels.length; i++) {
            if (monthlyIncome >= levels[i]) {
                tax += (levels[i] - levels[i - 1]) * rates[i - 1];
            } else {
                tax += (monthlyIncome - levels[i - 1]) * rates[i - 1];
                break;
            }
        }

        return tax;
    }

}
