/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Complex {
    private double re;
    private double im;

    public Complex() {
    }

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double Getre() {
        return re;
    }

    public double Getim() {
        return im;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        re = sc.nextDouble();
        im = sc.nextDouble();
    }

    public void print() {
        System.out.println("z = " + re + " + " + im + "i");
    }

    public Complex plus(Complex c) {
        Complex com = new Complex();
        com.re += re + c.re;
        com.im += im + c.im;
        return com;
    }

    public Complex minus(Complex c) {
        Complex com = new Complex();
        com.re += re - c.re;
        com.im += im - c.im;
        return com;
    }

    public Complex multiply(Complex c) {
        Complex com = new Complex();
        com.re = re * c.re - im * c.im;
        com.im = re * c.im + im * c.re;
        return com;
    }

    public Complex division(Complex c) {
        Complex com = new Complex();
        com.re = (re * c.re + im * c.im) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
        com.im = (im * c.re - re * c.im) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
        return com;
    }

}
