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
public class PartTimeEmployee extends Employee {

    private int workingHour;
    private float payRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int workingHour, float payRate, String employeeID, String employeeName, int yearOfBirth,
            String address, String phone) {
        super(employeeID, employeeName, yearOfBirth, address, phone);
        this.workingHour = workingHour;
        this.payRate = payRate;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public float getPayRate() {
        return payRate;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter working hour's part time Employee: ");
        workingHour = sc.nextInt();
        System.out.println("Enter pay rate's part time Employee: ");
        payRate = sc.nextFloat();
    }

    @Override
    public String getInfo() {
        return " - EmployeeID: " + employeeID +
                " - Employee Name: " + employeeName +
                " - Employee Name: " + employeeName +
                " - Year Of Birth: " + yearOfBirth +
                " - Address: " + address +
                " - Phone: " + phone +
                " - Working Hour: " + workingHour + " - Pay Rate: " + payRate;
    }

    @Override
    public float getPayment() {
        return workingHour * payRate;
    }

}
