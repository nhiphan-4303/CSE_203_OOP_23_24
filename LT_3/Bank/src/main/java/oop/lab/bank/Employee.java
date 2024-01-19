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
public abstract class Employee extends Person {

    private double salary;

    public Employee() {
    }

    public Employee(double salary, String firstName, String lastName, int age, String occupation,
            String identityCardNumber) {
        super(firstName, lastName, age, occupation, identityCardNumber);
        this.salary = salary;
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

}
