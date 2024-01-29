/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.lab.q1_lab4;

import java.util.HashMap;

/**
 *
 * @author hanie
 */
import java.util.*;

public class Dictionary {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();
        dic.put("Hello", "Xin chào");
        dic.put("Bye", "Tạm biệt");
        dic.put("Cat", "Con mèo");
        dic.put("Dog", "Con chó");
        dic.put("Sky", "Bầu trời");
        dic.put("Cloud", "Mây");
        dic.put("Rain", "Mưa");
        dic.put("Name", "Tên");
        dic.put("Water", "Nước");
        dic.put("Fish", "Cá");

        System.out.println("Enter the word: ");
        String w = sc.nextLine();
        meaning(w, dic);
    }

    public static void meaning(Object key, HashMap dic) {
        if (containsKey(key, dic)) {
            System.out.println("Meaning: " + dic.get(key));
        } else {
            System.out.println("Unavailable");
        }
    }

    public static boolean containsKey(Object key, HashMap dic) {
        if (dic.containsKey(key)) {
            return true;
        } else {
            return false;
        }
    }
}
