/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1_lab_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author hanie
 */
public class Student_List implements Serializable {

    protected Vector<Student> listStudent = new Vector<Student>();

    public void setList(Vector<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public Vector<Student> getListStudent() {
        return listStudent;
    }

    public Student_List() {
        loadUniversity();
    }

    public Student_List(Vector<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void inputCollegeList() {

        Student s = new College_Students();
        s.input();
        listStudent.add(s);
        saveUniversity();

    }

    public void inputUniversityList() {

        Student s = new University_Students();
        s.input();
        listStudent.add(s);
        saveUniversity();
    }

    public void removeByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student code: ");
        String code = sc.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if (code.equalsIgnoreCase(listStudent.get(i).getNumber())) {
                listStudent.remove(i);
                System.out.println("Finish!");
            } else {
                System.out.println("Not found!");
            }

        }
        saveUniversity();
    }

    public void outputList() {

        for (Student s : listStudent) {
            s.output();
        }

    }

    public void GraduStudent() {
        int count = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).graduation()) {
                listStudent.get(i).output();
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
        listStudent.sort(com);
        System.out.println("Finish !");
    }

    public void findStudentByName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getFullname().contains(name)) {
                listStudent.get(i).output();
                System.out.println("__________________________________");
            }
        }
    }

    String fileName = "University.Dat";

    public void saveUniversity() {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(listStudent);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error save file" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadUniversity() {
        try {
            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream inStream = new ObjectInputStream(f);
            listStudent = (Vector<Student>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error load file");
        }

    }

}
