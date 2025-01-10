/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.store_manage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class List_Product {
    static Scanner sc = new Scanner(System.in);

    ArrayList<Product> listProduct = new ArrayList<Product>();

    public List_Product() {
    }

    public ArrayList<Product> getlistProduct() {
        return listProduct;
    }

    public void setlistProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public List_Product(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public void inputListProduct() {
        System.out.println("Nhap so luong san pham: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Nhap code: ");
            String code = sc.nextLine();
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap gia: ");
            int price = sc.nextInt();
            System.out.println("Nhap ngay san xuat: ");
            int date = sc.nextInt();

            Product p = new Product(code, name, price, date);
            listProduct.add(p);
            System.out.println("____________________________");
        }
    }

    public void outputListProduct() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i).toString());
            System.out.println("____________________________");

        }
    }

    public void outputPriceLess100() {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getPrice() < 100) {
                System.out.println("Nhung san pham co gia nho hon 100: ");
                System.out.println(listProduct.get(i).toString());
            }
        }
        System.out.println("____________________________");
    }

    public void sortDate() {
        Collections.sort(listProduct, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Integer.compare(p1.getDate(), p2.getDate());
            }
        });
    }
}
