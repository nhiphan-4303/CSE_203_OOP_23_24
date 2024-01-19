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
public class Officer extends Employee {

    private String numerberOffice;

    public Officer() {

    }

    public Officer(String numerberOffice, double salary, String firstName, String lastName, int age, String occupation,
            String identityCardNumber) {
        super(salary, firstName, lastName, age, occupation, identityCardNumber);
        this.numerberOffice = numerberOffice;
    }

    public String getNumerberOffice() {
        return numerberOffice;
    }

    public void setNumerberOffice(String numerberOffice) {
        this.numerberOffice = numerberOffice;
    }

    @Override
    public void inputPerson() {
        Scanner sc = new Scanner(System.in);
        super.inputPerson();
        System.out.println("Number Office: ");
        numerberOffice = sc.nextLine();

    }

    @Override
    public void outputPerson() {
        super.outputPerson();
        System.out.println(" - Number Office: " + numerberOffice);
    }

    @Override
    public double caculateSalary() {
        return getSalary() * 1800000;
    }

}
