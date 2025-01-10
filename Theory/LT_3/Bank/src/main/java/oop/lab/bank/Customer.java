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
public class Customer extends Person {

    public Customer() {

    }

    public Customer(int creditRating, String firstName, String lastName, int age, String occupation,
            String identityCardNumber) {
        super(firstName, lastName, age, occupation, identityCardNumber);
        this.creditRating = creditRating;
    }

    private int creditRating;

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    @Override
    public void inputPerson() {
        super.inputPerson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Credit rating: ");
        creditRating = sc.nextInt();
    }

    @Override
    public void outputPerson() {
        super.outputPerson();
        System.out.println(" - Credit rating: " + creditRating);
    }

}
