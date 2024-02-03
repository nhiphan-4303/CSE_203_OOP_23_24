/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q3_lab4;

/**
 *
 * @author hanie
 */
public class College_Students extends Student {

    private double graExamScore;

    public College_Students() {

    }

    public College_Students(double graExamScore, String number, String fullname, int totalCredit, double avrScore) {
        super(number, fullname, totalCredit, avrScore);
        this.graExamScore = graExamScore;
    }

    public double getGraExamScore() {
        return graExamScore;
    }

    public void setGraExamScore(double graExamScore) {
        this.graExamScore = graExamScore;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Enter the graduation exam score: ");
        graExamScore = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.print(" - The graduation exam score: " + graExamScore + "\n");
    }

    @Override
    public boolean graduation() {
        
        super.getTotalCredit();
        super.getAvrScore();

        if (getTotalCredit() >= 100 && getAvrScore() >= 5 && graExamScore >= 5) {
            return true;
        }
        return false;
    }

}
