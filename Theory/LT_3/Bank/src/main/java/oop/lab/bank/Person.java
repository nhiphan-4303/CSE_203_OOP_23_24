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
public class Person  {

    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
    private String identityCardNumber;

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

    Person() {
    }

    Person(String firstName, String lastName, int age, String occupation, String identityCardNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;

    }

    public void inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First name: ");
        firstName = sc.nextLine();
        System.out.println("Last name: ");
        lastName = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Occupation: ");
        occupation = sc.nextLine();
        System.out.println("ID number: ");
        identityCardNumber = sc.nextLine();
    }

    public void outputPerson() {
        System.out.println(" - First name: " + firstName + " - Last name: " + lastName + " - Age: " + age +
                "\n" + " - Occupation: " + occupation + " - ID number: " + identityCardNumber);

    }

    

}
