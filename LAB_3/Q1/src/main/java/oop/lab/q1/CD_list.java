/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1;

import java.util.ArrayList;
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
        System.out.println("Enter the collection (game/movie/music): ");
        String collection = sc.nextLine();
        for (int i = 0; i < cdList.size(); i++) {
            if (collection.equalsIgnoreCase(cdList.get(i).getCollection())) {
                cdList.get(i).output();
            }
        }
    }

    public void seachByType() {
        System.out.println("Enter the type (audio or video): ");
        String type = sc.nextLine();
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

    public void sortAsc() {

    }

}
