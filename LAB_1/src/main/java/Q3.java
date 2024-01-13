/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hanie
 */
import java.util.*;

public class Q3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int a;
        int b;

        while (n > 1) {
            if (n % 2 != 0) {
                a = 3 * n + 1;
                System.out.println(n + " is odd, so we take 3*n+1: " + a);
                n = a;
            }
            if (n % 2 == 0) {
                b = n / 2;

                System.out.println(n + " is even, so we take n/2: " + b);
                n = b;
            }

        }
    }

}
