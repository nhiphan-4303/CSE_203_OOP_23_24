/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.fractor_demo;

/**
 *
 * @author hanie
 */
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {

    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int GetNumerator() {
        return numerator;
    }

    public int GetDenominator() {
        return denominator;
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }

    private int GeneralDivisor() {
        int a = numerator;
        int b = denominator;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void simplify() {
        int t = GeneralDivisor();
        numerator /= t;
        denominator /= t;
    }

    public void inverse() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }
    

}
