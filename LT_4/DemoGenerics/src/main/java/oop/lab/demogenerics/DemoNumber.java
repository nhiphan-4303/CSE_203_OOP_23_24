/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.demogenerics;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class DemoNumber<T> {

    T number1;
    T number2;

    public T getNumber1() {
        return number1;
    }

    public void setNumber(T number1) {
        this.number1 = number1;
    }

    public T getNumber2() {
        return number2;
    }

    public void setNumber2(T number2) {
        this.number2 = number2;
    }

    public DemoNumber() {

    }

    public DemoNumber(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1: ");
        number1 = (T) sc.next();
        System.out.println("Number 2: ");
        number2 = (T) sc.next();

    }

    public void Sum() {
        System.out.println((T) number1 + (T) number2);

    }

    public void Output() {
        System.out.println(number1);
        System.out.println(number2);
    }

}
