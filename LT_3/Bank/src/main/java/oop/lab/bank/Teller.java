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
public class Teller extends Employee {

    private String stationNumber;
    private float hoursWorked;

    public Teller() {

    }

    public Teller(String stationNumber, float hoursWorked, double salary, String firstName, String lastName, int age,
            String occupation, String identityCardNumber) {
        super(salary, firstName, lastName, age, occupation, identityCardNumber);
        this.stationNumber = stationNumber;
        this.hoursWorked = hoursWorked;
    }

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void inputPerson() {
        super.inputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Station number: ");
        stationNumber = sc.nextLine();
        System.out.println("Worked Hours:  ");
        hoursWorked = sc.nextFloat();

    }

    @Override
    public void outputPerson() {
        super.outputPerson();
        System.out.println(" - Station number: " + stationNumber + " - Worked hours: " + stationNumber);
    }

    @Override
    public double caculateSalary() {
        return getSalary() * 1800000;
    }

}
