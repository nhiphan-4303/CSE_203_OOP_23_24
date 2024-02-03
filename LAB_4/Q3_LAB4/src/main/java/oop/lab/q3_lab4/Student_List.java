/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q3_lab4;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author hanie
 */
public class Student_List {

    protected Vector<Student> list = new Vector<Student>();

    public Student_List() {
    }

    public Student_List(Vector<Student> list) {
        this.list = list;
    }

    public void inputCollegeList() {

        Student s = new College_Students();
        s.input();
        list.add(s);

    }

    public void inputUniversityList() {

        Student s = new University_Students();
        s.input();
        list.add(s);

    }

    public void removeByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student code: ");
        String code = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (code.equalsIgnoreCase(list.get(i).getNumber())) {
                list.remove(i);
                System.out.println("Finish!");
            } else {
                System.out.println("Not found!");
            }

        }

    }

    public void outputList() {

        for (Student s : list) {
            s.output();
        }

    }

    public void GraduStudent() {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).graduation()) {
                list.get(i).output();
                System.out.println(" - Eligible Student: ");
                System.out.println();
                count++;
            }
        }
        System.out.println("The number of Eligible students: " + count);
    }

    public void sort() {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {

                if (s1 instanceof College_Students && s2 instanceof University_Students) {
                    return -1;
                } else if (s1 instanceof University_Students && s2 instanceof College_Students) {
                    return 1;
                } else {
                    return s1.getNumber().compareTo(s2.getNumber());
                }
            }
        };
        list.sort(com);
        System.out.println("Finish !");
    }

    public void findStudentByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFullname().contains(name)) {
                list.get(i).output();
                System.out.println("__________________________________");
            }
        }
    }

}
