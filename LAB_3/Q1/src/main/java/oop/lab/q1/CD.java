/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class CD {

    private String id;
    private String collection;
    private String type;
    private String title;
    private double price;
    private int yearOfRelease;

    public CD() {

    }

    public CD(String id, String collection, String type, String title, double price, int yearOfRelease) {
        this.id = id;
        this.collection = collection;
        this.type = type;
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CD id: ");
        id = sc.nextLine();
        do {
            System.out.println("Enter the CD collection (game/movie/music): ");
            collection = sc.nextLine();
        } while (!collection.equalsIgnoreCase("game") && !collection.equalsIgnoreCase("movie") && !collection.equalsIgnoreCase("music"));
        do {
            System.out.println("Enter the CD type (audio or video): ");
            type = sc.nextLine();
        } while (!type.equalsIgnoreCase("audio") && !type.equalsIgnoreCase("video"));
        System.out.println("Enter the title: ");
        title = sc.nextLine();
        System.out.println("Enter the price: ");
        price = sc.nextDouble();
        System.out.println("Enter the year of release: ");
        yearOfRelease = sc.nextInt();
    }

    public void output() {
        System.out.println(" - Id: " + id + " - Collection: " + collection + " - Type: " + type
                + " - Title: " + title + " - Price: " + price + " - Year of release: " + yearOfRelease);
    }

}
