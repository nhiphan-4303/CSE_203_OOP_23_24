/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q1_lab_5;

import java.util.Scanner;

/**
 *
 * @author hanie
 */
public abstract class Student {

    static Scanner sc = new Scanner(System.in);

    protected String number;
    protected String fullname;
    protected int totalCredit;
    protected double avrScore;

    public Student() {
    }

    public Student(String number, String fullname, int totalCredit, double avrScore) {
        this.number = number;
        this.fullname = fullname;
        this.totalCredit = totalCredit;
        this.avrScore = avrScore;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public double getAvrScore() {
        return avrScore;
    }

    public void setAvrScore(double avrScore) {
        this.avrScore = avrScore;
    }

    public void input() {
        System.out.print("Enter the student number: ");
        number = sc.nextLine();
        System.out.print("Enter the student full name: ");
        fullname = sc.nextLine();
        System.out.print("Enter the total number of credits earned: ");
        totalCredit = sc.nextInt();
        System.out.print("Enter the average score: ");
        avrScore = sc.nextDouble();
        sc.nextLine();

    }

    public void output() {
        System.out.print(" - Student Number: " + number
                + " - Full name: " + fullname + "\n"
                + " - The total number of credits earned:" + totalCredit
                + " - Average Score: " + avrScore + "\n");
    }

    public abstract boolean graduation();

    public void remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
