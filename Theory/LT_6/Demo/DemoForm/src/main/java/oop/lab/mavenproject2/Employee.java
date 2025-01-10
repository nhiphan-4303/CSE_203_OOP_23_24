/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.mavenproject2;

/**
 *
 * @author hanie
 */
import java.io.Serializable;

public  class Employee implements Serializable {

    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String identityCardNumber;
    private double salary;
    private int numberDependants;
    private int numberOffice;

    public Employee(String firstName, String lastName, int age, String occupation, String identityCardNumber,
            double salary, int numberDependants, int numberOffice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;
        this.salary = salary;
        this.numberDependants = numberDependants;
        this.numberOffice = numberOffice;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberDependants() {
        return numberDependants;
    }

    public void setNumberDependants(int numberDependants) {
        this.numberDependants = numberDependants;
    }

    public int getNumberOffice() {
        return numberOffice;
    }

    public void setNumberOffice(int numberOffice) {
        this.numberOffice = numberOffice;
    }
}