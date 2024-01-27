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
public abstract class Employee {

    protected String employeeID;
    protected String employeeName;
    protected int yearOfBirth;
    protected String address;
    protected String phone;

    public Employee() {
    }

    public Employee(String employeeID, String employeeName, int yearOfBirth, String address, String phone) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phone = phone;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        employeeID = sc.nextLine();
        System.out.println("Enter the name: ");
        employeeName = sc.nextLine();
        System.out.println("Enter the year of birth: ");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the phone number: ");
        phone = sc.nextLine();
    }

    public abstract String getInfo();

    public abstract float getPayment();

}
