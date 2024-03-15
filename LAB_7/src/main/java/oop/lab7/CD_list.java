/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab7;

import java.io.Serializable;
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

    private ArrayList<CD> cdList = new ArrayList<>();

    public ArrayList<CD> getCdList() {
        return cdList;
    }

    public void setCdList(ArrayList<CD> cdList) {
        this.cdList = cdList;
    }

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

            } else {
                System.out.println("Not found !");
            }
        }
    }

    public void searchByCollection() {
        String collection;
        System.out.println("Enter the collection (game/movie/music): ");
        collection = sc.nextLine();

        for (int i = 0; i < cdList.size(); i++) {
            if (collection.equalsIgnoreCase(cdList.get(i).getCollection())) {
                cdList.get(i).output();

            } else {
                System.out.println("Not found !");
            }

        }
    }

    public void seachByType() {
        String type;

        System.out.println("Enter the type (audio or video): ");
        type = sc.nextLine();

        for (int i = 0; i < cdList.size(); i++) {
            if (type.equalsIgnoreCase(cdList.get(i).getType())) {
                cdList.get(i).output();

            } else {
                System.out.println("Not found !");
            }
        }
    }

    public CD findByTitle(String title) {
        for (CD cd : cdList) {
            if (cd.getTitle().equalsIgnoreCase(title)) {
                return cd;
            }
        }
        return null;
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
        System.out.println(" Enter the ID's CD to edit: ");
        String id = sc.nextLine();

        for (int i = 0; i < cdList.size(); i++) {
            if (id.equalsIgnoreCase(cdList.get(i).getId())) {

                System.out.println(" - Collection: " + cdList.get(i).getCollection());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String collection = sc.nextLine();

                if (!collection.isEmpty()) {

                    do {
                        System.out.println(" Enter the collection (game/movie/music): ");
                        collection = sc.nextLine();
                    } while (!collection.equalsIgnoreCase("game")
                            && !collection.equalsIgnoreCase("movie")
                            && !collection.equalsIgnoreCase("music")
                            && !collection.equalsIgnoreCase("\n"));
                    cdList.get(i).setCollection(collection);
                }

                System.out.println(" - Type: " + cdList.get(i).getType());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String type = sc.nextLine();

                if (!type.isEmpty()) {

                    do {
                        System.out.println(" Enter the type (audio or video): ");
                        type = sc.nextLine();
                    } while (!type.equalsIgnoreCase("\n")
                            && !type.equalsIgnoreCase("audio")
                            && !type.equalsIgnoreCase("video"));
                    cdList.get(i).setType(type);
                }

                System.out.println(" - Title: " + cdList.get(i).getTitle());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String title = sc.nextLine();

                if (!title.isEmpty()) {
                    System.out.println(" Enter the title: ");
                    title = sc.nextLine();
                    cdList.get(i).setTitle(title);
                }

                System.out.println(" - Price: " + cdList.get(i).getPrice());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String change = sc.nextLine();

                if (!change.isEmpty()) {
                    System.out.println("Enter the price: ");
                    double price = sc.nextDouble();
                    cdList.get(i).setPrice(price);
                }

                System.out.println(" - Year Of Release: " + cdList.get(i).getYearOfRelease());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                change = sc.nextLine();

                if (!change.isEmpty()) {
                    System.out.println(" Enter the year: ");
                    int year = sc.nextInt();
                    cdList.get(i).setYearOfRelease(year);
                }
            } else {
                System.out.println(" Not found !");
            }
        }
    }

    public void sortAsc() {
        Comparator<CD> com = new Comparator<CD>() {
            public int compare(CD o1, CD o2) {
                return o1.getYearOfRelease() - o2.getYearOfRelease();
            }
        };
        cdList.sort(com);
    }

    /////////////////////
    public ArrayList<CD> searchByTitle(String title) {
        ArrayList<CD> results = new ArrayList<>();
        for (CD cd : cdList) {
            if (cd.getTitle().equalsIgnoreCase(title)) {
                results.add(cd);
            }
        }
        return results;
    }

    public ArrayList<CD> searchByCollection(String collection) {
        ArrayList<CD> results = new ArrayList<>();
        for (CD cd : cdList) {
            if (cd.getCollection().equalsIgnoreCase(collection)) {
                results.add(cd);
            }
        }
        return results;
    }

    public ArrayList<CD> seachByType(String type) {
        ArrayList<CD> results = new ArrayList<>();
        for (CD cd : cdList) {
            if (cd.getType().equalsIgnoreCase(type)) {
                results.add(cd);
            }
        }
        return results;
    }

    public ArrayList<CD> searchByPrice(double price) {
        ArrayList<CD> results = new ArrayList<>();
        for (CD cd : cdList) {
            if (cd.getPrice() <= price) {
                results.add(cd);
            }
        }
        return results;
    }
}
