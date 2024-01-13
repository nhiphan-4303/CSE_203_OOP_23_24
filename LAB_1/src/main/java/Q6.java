/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author hanie
 */
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // cau a
        /* Find the length of the string (ham dem luon dau cach) */
        System.out.println("Length of string S: " + s.length()); // include space

        // cau b
        /* Count the number of words in string */
        /* Ham split ngat khi gap dau cach, them vao ham moi roi dem */
        String[] strWord = s.split(" ");
        System.out.println("Number of words of string s: " + strWord.length);

        // cau c
        /* Concatenate one stirng's content to another */
        String conString = " la mot lap trinh vien gioi";
        System.out.println(s.concat(conString));

        // cau d
        /* check if a string is a palindrome or not */
        String[] strReverse = s.split("");
        String tmp = "";
        String tmp2 = "";
        for (String x : strWord) {
            tmp2 += x + " ";
        }
        tmp2 = tmp2.replaceAll("\\s+$", "");
        for (int i = strReverse.length - 1; i >= 0; i--) {
            tmp += strReverse[i];
        }
        if (tmp.equals(s) || tmp2.equals(s)) {
            System.out.println("This string is Palindrome");
        } else {
            System.out.println("This string is not Palindrome");
        }
    }
}
