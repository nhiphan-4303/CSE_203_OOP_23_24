/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.q3;

/**
 *
 * @author hanie
 */
public class Employee {

    private String employeeCode;
    private String fullName;
    private int yearsOfService;
    private double salaryCoefficient;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String employeeCode, String fullName, int yearsOfService, double salaryCoefficient, double basicSalary) {
        this.employeeCode = employeeCode;
        this.fullName = fullName;
        this.yearsOfService = yearsOfService;
        this.salaryCoefficient = salaryCoefficient;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        double totalSalary = salaryCoefficient * basicSalary;
        return totalSalary;
    }

    public void output() {
        System.out.println("- Code: " + employeeCode);
        System.out.println("- Full name: " + fullName);
        System.out.println("- Salary: " + calculateSalary());
    }

}
