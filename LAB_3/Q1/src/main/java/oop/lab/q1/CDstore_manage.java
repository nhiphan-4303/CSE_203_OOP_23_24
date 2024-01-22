/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.q1;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class CDstore_manage {

    public static void main(String[] args) {
        CD_list cd = new CD_list();
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.printf("1. Add CD (ArrayList)\n"
                    + "2. Search CD by CD title\n"
                    + "3. Search CDs by collection (game/movie/music)\n"
                    + "4. Search CDs by type (audio/video)\n"
                    + "5. Delete CD by CD Id\n"
                    + "6. Edit CD information by Id\n"
                    + "7. Display all CDs\n"
                    + "8. Sort the CD list ascending by year of release\n"
                    + "9. Exit\nChoose the number: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    cd.addCD();
                    System.out.println("____________________________________");
                    break;
                case 2:
                    cd.searchByTitle();
                    System.out.println("____________________________________");
                    break;
                case 3:
                    cd.searchByCollection();
                    System.out.println("____________________________________");
                    break;
                case 4:
                    cd.seachByType();
                    System.out.println("____________________________________");
                    break;
                case 5:
                    cd.deleteById();
                    System.out.println("Done");
                    System.out.println("____________________________________");
                    break;
                case 6:
                    cd.editInfoById();
                    System.out.println("____________________________________");
                    break;
                case 7:
                    cd.outputList();
                    System.out.println("____________________________________");
                    break;
                case 8:
                    cd.sortAsc();
                    break;
                case 9:
                    break;

            }
        } while (menu != 9);
    }

}
