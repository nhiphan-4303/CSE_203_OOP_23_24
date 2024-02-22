/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.demogenerics;

/**
 *
 * @author hanie
 */
public class DemoGenerics {

    public static void main(String[] args) {
        DemoNumber<Integer> num = new DemoNumber<Integer>();
        num.Input();
        num.Output();
//        DemoNumber<Double> num2 = new DemoNumber<Double>(4.5, 6.8);
//        num2.Output();
    }
}
