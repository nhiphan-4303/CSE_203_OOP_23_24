/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.bank;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Secretary extends Officer {

    private float hoursWorked;

    public Secretary() {

    }

    public Secretary(float hoursWorked, String numerberOffice, double salary, String firstName, String lastName, int age, String occupation, String identityCardNumber) {
        super(numerberOffice, salary, firstName, lastName, age, occupation, identityCardNumber);
        this.hoursWorked = hoursWorked;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public void inputPerson() {
        Scanner sc = new Scanner(System.in);
        super.inputPerson();
        System.out.println("Enter Hour Works: ");
        hoursWorked = sc.nextFloat();

    }

    @Override
    public void outputPerson() {
        super.outputPerson();
        System.out.println(" - Hour Works: " + hoursWorked);
    }

    @Override
    public double caculateSalary() {
        return getSalary() * 1800000;
    }
    

}
