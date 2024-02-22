/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.store_manage;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Product {

    static Scanner sc = new Scanner(System.in);
    private String code;
    private String name;
    private int price;
    private int date;

    public Product() {
    }

    public Product(String code, String name, int price, int date) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void output() {
        System.out.println("Code " + code);
        System.out.println("Name " + name);
        System.out.println("Price " + price);
        System.out.println("Date " + date);
    }

    public String toString() {
        return "Code: " + code + " Name: " + name + " Price: " + price + " Date: " + date;
    }

}
