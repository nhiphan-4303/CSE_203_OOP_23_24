/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class CD_list {

    static Scanner sc = new Scanner(System.in);

    ArrayList<CD> cdList = new ArrayList<CD>();

    public CD_list() {
    }

    public CD_list(ArrayList<CD> cdList) {
        this.cdList = cdList;
    }

    public void addCD() {
        System.out.println("Enter the number of CDs to add into list: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            CD cd = new CD();
            cd.input();
            cdList.add(cd);
        }

    }

    public void outputList() {
        for (int i = 0; i < cdList.size(); i++) {
            cdList.get(i).output();
        }
    }

    public void searchByTitle() {
        System.out.println("Enter the title: ");
        String title = sc.nextLine();
        for (int i = 0; i < cdList.size(); i++) {
            if (title.equalsIgnoreCase(cdList.get(i).getTitle())) {
                cdList.get(i).output();
            }
        }
    }

    public void searchByCollection() {
        String collection;
        do {
            System.out.println("Enter the collection (game/movie/music): ");
            collection = sc.nextLine();
        } while (!collection.equalsIgnoreCase("game") && !collection.equalsIgnoreCase("movie")
                && !collection.equalsIgnoreCase("music"));
        for (int i = 0; i < cdList.size(); i++) {
            if (collection.equalsIgnoreCase(cdList.get(i).getCollection())) {
                cdList.get(i).output();
            }
        }
    }

    public void seachByType() {
        String type;
        do {
            System.out.println("Enter the type (audio or video): ");
            type = sc.nextLine();
        } while (!type.equalsIgnoreCase("audio")
                && !type.equalsIgnoreCase("video"));
        for (int i = 0; i < cdList.size(); i++) {
            if (type.equalsIgnoreCase(cdList.get(i).getType())) {
                cdList.get(i).output();
            }
        }
    }

    public void deleteById() {
        System.out.println("Enter the ID's CD to delete: ");
        String id = sc.nextLine();
        for (int i = 0; i < cdList.size(); i++) {
            if (id.equalsIgnoreCase(cdList.get(i).getId())) {
                cdList.remove(i);
            }
        }
    }

    public void editInfoById() {
        System.out.println("Enter the ID's CD to edit: ");
        String id = sc.nextLine();
        for (int i = 0; i < cdList.size(); i++) {
            if (id.equalsIgnoreCase(cdList.get(i).getId())) {
                String collection;
                do {
                    System.out.println("Enter the collection (game/movie/music): ");
                    collection = sc.nextLine();
                } while (!collection.equalsIgnoreCase("game") && !collection.equalsIgnoreCase("movie")
                        && !collection.equalsIgnoreCase("music"));
                cdList.get(i).setCollection(collection);

                String type;
                do {
                    System.out.println("Enter the type (audio or video): ");
                    type = sc.nextLine();
                } while (!type.equalsIgnoreCase("audio")
                        && !type.equalsIgnoreCase("video"));
                cdList.get(i).setType(type);

                System.out.println("Enter the title: ");
                String title = sc.nextLine();
                cdList.get(i).setTitle(title);

                System.out.println("Enter the price: ");
                double price = sc.nextDouble();
                cdList.get(i).setPrice(price);

                System.out.println("Enter the year: ");
                int year = sc.nextInt();
                cdList.get(i).setYearOfRelease(year);
            }
        }
    }

    public void sortAsc() {
        Comparator<CD> com = new Comparator<CD>() {
            public int compare(CD o1, CD o2) {
                return o2.getYearOfRelease() - o1.getYearOfRelease();
            }
        };
        cdList.sort(com);
    }

}
