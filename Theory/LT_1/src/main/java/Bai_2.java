/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author hanie
 */
/*Write a Java program that receive the full name of a person and write function to:
*Return the first name and last name except the middle name(Nguyen Van Chien -> Nguyen Chien)
*Return the middle name 
*Capital the full name
*Uppercase all vowels and lowercase all consonants. (Ex: Nguyen Van Chien → ngUyEn vAn chIEn) 
 */
import java.util.*;

public class Bai_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String fullName = sc.nextLine();
        String[] splitName = splitName(fullName);
        output(splitName);
        output_1(splitName);

    }

    public static void output_1(String[] n) {
        for (int i = 1; i < n.length - 1; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }

    public static void output(String[] n) {
        System.out.print(n[0] + " " + n[n.length - 1]);
        System.out.println();

    }

    public static String[] splitName(String n) {
        String[] splitName = n.split("\\s");
        return splitName;

    }

}
