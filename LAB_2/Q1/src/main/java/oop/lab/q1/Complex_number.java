/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.q1;

/**
 *
 * @author hanie
 */
public class Complex_number {

    public static void main(String[] args) {
        Complex a = new Complex(); 
        Complex b = new Complex();  

        a.input();
        b.input();
        a.print();
        b.print();
        
        System.out.println("Plus: ");
        a.plus(b).print();
        System.out.println("Minus: ");
        a.minus(b).print();
        System.out.println("Multiply: ");
        a.multiply(b).print();
        System.out.println("Division: ");
        a.division(b).print();

    }
}
