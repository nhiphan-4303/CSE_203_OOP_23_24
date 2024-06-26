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
public abstract class Employee extends Person implements ITax, IInsurance {

    private double salary;
    protected int numberDependants;

    public Employee() {
    }

    public Employee(double salary, String firstName, String lastName, int age, String occupation,
            String identityCardNumber) {
        super(firstName, lastName, age, occupation, identityCardNumber);
        this.salary = salary;
    }

    public int getNumberDependants() {
        return numberDependants;
    }

    public void setNumberDependants(int numberDependants) {
        this.numberDependants = numberDependants;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void inputPerson() {
        super.inputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Salary: ");
        salary = sc.nextDouble();

    }

    @Override
    public void outputPerson() {
        super.outputPerson();
        System.out.println(" - Salary: " + salary);

    }

    public abstract double caculateSalary();

    @Override
    public void InputDependant() {
        System.out.print("Input Dependant: ");
        Scanner sc = new Scanner(System.in);
        numberDependants = sc.nextInt();
    }

    @Override
    public void PersonalIncomeTax() {

    }

    @Override
    public void OutputPersonalIncomeTax() {
        System.out.print(" - Dependant: ");
        System.out.println(numberDependants);
        System.out.println(" - Personal income tax: " + caculateSalary() * 0.05);
    }

    @Override
    public void calculInsur() {

    }
}
