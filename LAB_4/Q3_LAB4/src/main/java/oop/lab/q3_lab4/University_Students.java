/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q3_lab4;

/**
 *
 * @author hanie
 */
public class University_Students extends Student {

    private String thesisName;
    private double thesisScore;

    public University_Students() {

    }

    public University_Students(String thesisName, double thesisScore, String number, String fullname, int totalCredit,
            double avrScore) {
        super(number, fullname, totalCredit, avrScore);
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter thesis name: ");
        thesisName = sc.nextLine();
        System.out.print("Enter thesis score: ");
        thesisScore = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(" - Thesis name: " + thesisName + " - Thesis Score: " + thesisScore + "\n");
    }

    @Override
    public boolean graduation() {
        super.getTotalCredit();
        super.getAvrScore();
        if (getTotalCredit() >= 150 && getAvrScore() >= 5 && thesisScore >= 5) {
            return true;
        }
        return false;
    }

}
