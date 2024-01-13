/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author hanie
 */
import java.util.*;

public class Q1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int ln = n % 10;

        while (n > 10) {
            n /= 10;
        }
        System.out.print(n + ln);

    }

}
