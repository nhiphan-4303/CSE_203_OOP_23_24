/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.phanngochanhnhi_2131209002;

import java.util.*;

/**
 *
 * @author Student
 */
public class Person {

    static Scanner sc = new Scanner(System.in);

    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String name, int age, String address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input() {
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the phone number: ");
        phoneNumber = sc.nextLine();
        System.out.println("Enter the email: ");
        email = sc.nextLine();
    }

}
