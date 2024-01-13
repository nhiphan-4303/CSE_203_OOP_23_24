/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hanie
 */
import java.util.*;

public class Q4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int size = sc.nextInt();
        int sum = 0;
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.print(sum);
    }

}
