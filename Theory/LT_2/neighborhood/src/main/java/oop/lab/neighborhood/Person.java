/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.neighborhood;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Person {

    //Thuoc tinh
    String firstName;
    String lastName;
    int age;
    String occupation;
    String identityCardNumber;

    //Phuong thuc
    //1.Khởi tạo (hàm khởi tạo -> không có giá trị trả về)
    Person(){
        
    }
    Person(String firstName, String lastName, int age, String occupation, String identityCardNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.identityCardNumber = identityCardNumber;

    }

    //2.Các phương thức khác
    void InputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        firstName = sc.nextLine();
        System.out.print("Last name: ");
        lastName = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();

    }

    void OutputPerson() {
        System.out.println("First name: " + firstName + " - Last name: " + lastName + " - Age: " + age);

    }

    int GetAge() {
        return age;
    }

}
