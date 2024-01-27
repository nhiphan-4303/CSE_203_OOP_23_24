/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q2;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class FullTimeEmployee extends Employee {

    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(float salary, String employeeID, String employeeName, int yearOfBirth, String address,
            String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter salary's full time Employee: ");
        salary = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        return " - EmployeeID: " + employeeID +
                " - Employee Name: " + employeeName +
                " - Employee Name: " + employeeName +
                " - Year Of Birth: " + yearOfBirth +
                " - Address: " + address +
                " - Phone: " + phone +
                " - Salary: " + salary;
    }

    @Override
    public float getPayment() {
        return salary;
    }

}
