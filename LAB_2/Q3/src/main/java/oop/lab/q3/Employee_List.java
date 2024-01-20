/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Employee_List {

    ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee_List() {
    }

    public Employee_List(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void inputList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter code: ");
            String code = sc.nextLine();
            System.out.println("Full name: ");
            String name = sc.nextLine();
            System.out.println("Years of Service: ");
            int yearsOfService = sc.nextInt();
            System.out.println("Enter salary Coefficient: ");
            double salaryCoefficient = sc.nextDouble();
            System.out.println("Enter the basic Salary: ");
            double basicSalary = sc.nextDouble();
            sc.nextLine();

            Employee e = new Employee(code, name, yearsOfService, salaryCoefficient, basicSalary);
            employeeList.add(e);
        }
    }

    public void outputList() {
        for (Employee e : employeeList) {
            e.output();
        }
    }

    public void sortDes() {
        employeeList.sort(Comparator.comparing(Employee::calculateSalary).reversed());
    }

    public void highestSalary() {
        sortDes();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).calculateSalary() == employeeList.get(0).calculateSalary()) {
                employeeList.get(i).output();
            }
        }
    }
}
