/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Bank {

    private ArrayList<Employee> listEmployee = new ArrayList<>();

    public Bank() {
    }

    public Bank(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public ArrayList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(ArrayList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public void input() {

        System.out.println("Nhap so nhan vien: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Employee employee;
            System.out.println("1. Officer; 2.Teller");
            int k = sc.nextInt();
            switch (k) {
                case 1:
                    employee = new Officer();
                    employee.inputPerson();
                    listEmployee.add(employee);
                    break;
                case 2:
                    employee = new Teller();
                    employee.inputPerson();
                    listEmployee.add(employee);
                    break;
            }
        }
    }

    public void ouput() {
        for (int i = 0; i < listEmployee.size(); i++) {
            listEmployee.get(i).outputPerson();
        }
    }

    public double totalSalary() {
        double totalSalary = 0;
        for (int i = 0; i < listEmployee.size(); i++) {
            totalSalary += listEmployee.get(i).caculateSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Bank ACB = new Bank();
        ACB.input();
        ACB.ouput();
        System.out.println("Total salary: " + ACB.totalSalary());

    }
}
