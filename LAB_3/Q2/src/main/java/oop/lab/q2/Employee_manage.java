/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author hanie
 */
public class Employee_manage {

    private ArrayList<Employee> list = new ArrayList<>();

    public Employee_manage() {
    }

    public Employee_manage(ArrayList<Employee> list) {
        this.list = list;
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }

    public void inputFullTimeList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Employee f = new FullTimeEmployee();
            f.input();
            list.add(f);
        }
    }

    public void outputFullTimeList() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof FullTimeEmployee) {
                System.out.println(list.get(i).getInfo());
                System.out.println(" - Payment: " + list.get(i).getPayment());
            }
        }
    }

    public void inputPartTimeList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Employee p = new PartTimeEmployee();
            p.input();
            list.add(p);
        }
    }

    public void outputPartTimeList() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof PartTimeEmployee) {
                System.out.println(list.get(i).getInfo());
                System.out.println(" - Payment: " + list.get(i).getPayment());
            }
        }
    }

    public void outputAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
            System.out.println(" - Payment: " + list.get(i).getPayment());
        }
    }

    public void searchById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getEmployeeID())) {
                System.out.println(list.get(i).getInfo());
            } else {
                System.out.println("Not found !");
            }
        }
    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getEmployeeID())) {
                list.remove(i);
                System.out.println("Done !");
            } else {
                System.out.println("Not found !");
            }
        }
    }

    public void editInfoById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            Employee emp = list.get(i);
            if (id.equalsIgnoreCase(emp.getEmployeeID())) {

                System.out.println(" - Name: " + emp.getEmployeeName());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String name = sc.nextLine();

                if (!name.isEmpty()) {
                    System.out.println(" Enter the employee name: ");
                    name = sc.nextLine();
                    emp.setEmployeeName(name);
                }

                System.out.println(" - Year of Birth: " + emp.getYearOfBirth());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String change = sc.nextLine();

                if (!change.isEmpty()) {
                    System.out.println(" Enter the employee year of birth: ");
                    int year = sc.nextInt();
                    emp.setYearOfBirth(year);
                }

                System.out.println(" - Address: " + emp.getAddress());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String address = sc.nextLine();

                if (!address.isEmpty()) {
                    System.out.println(" Enter the employee address: ");
                    address = sc.nextLine();
                    emp.setAddress(address);
                }

                System.out.println(" - Phone: " + emp.getPhone());
                System.out.println(" Do want to save this information? (press Enter to Save) ");
                String phone = sc.nextLine();

                if (!phone.isEmpty()) {
                    System.out.println(" Enter the employee phone number: ");
                    phone = sc.nextLine();
                    emp.setPhone(phone);
                }
                if (emp instanceof FullTimeEmployee) {

                    FullTimeEmployee fullTimeEmployee = (FullTimeEmployee) emp;

                    System.out.println("Current salary is: " + fullTimeEmployee.getSalary());
                    System.out.println(" Do want to save this information? (press Enter to Save) ");
                    change = sc.nextLine();

                    if (!change.isEmpty()) {
                        System.out.println(" Enter the Full time employee Salary: ");
                        float salary = sc.nextFloat();
                        fullTimeEmployee.setSalary(salary);
                    }
                } else if (emp instanceof PartTimeEmployee) {
                    PartTimeEmployee partTimeEmployee = (PartTimeEmployee) emp;

                    System.out.println("Current working hour is: " + partTimeEmployee.getWorkingHour());
                    System.out.println(" Do want to save this information? (press Enter to Save) ");
                    change = sc.nextLine();

                    if (!change.isEmpty()) {
                        System.out.println(" Enter the part time employee working hour: ");
                        int hour = sc.nextInt();
                        partTimeEmployee.setWorkingHour(hour);
                    }

                    System.out.println("Current pay rate is: " + partTimeEmployee.getPayRate());
                    System.out.println(" Do want to save this information? (press Enter to Save) ");
                    change = sc.nextLine();

                    if (!change.isEmpty()) {
                        System.out.println(" Enter the part time employee payrate: ");
                        float rate = sc.nextInt();
                        partTimeEmployee.setPayRate(rate);
                    }
                }

            } else {
                System.out.println("Not found !");
            }
        }

    }

    public void searchByPayment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the payment: ");
        float payment = sc.nextFloat();
        for (int i = 0; i < list.size(); i++) {
            if (payment == list.get(i).getPayment()) {
                System.out.println(list.get(i).getInfo());
            } else {
                System.out.println("Not found !");
            }
        }
    }

    public void sortAcs() {
        Comparator<Employee> yearThenPayment = new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getYearOfBirth() < e2.getYearOfBirth()) {
                    return -1;
                } else if (e1.getYearOfBirth() > e2.getYearOfBirth()) {
                    return 1;
                } else {
                    // tuổi bằng sort lương
                    if (e1.getPayment() < e2.getPayment()) {
                        return 1;
                    } else if (e1.getPayment() > e2.getPayment()) {
                        return - 1;
                    } else {
                        return 0;
                    }
                }
            }
        };

        Collections.sort(list, yearThenPayment);
        System.out.println("Finish !");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        Employee_manage hr = new Employee_manage();

        do {
            System.out.print("1. Add Full-time Employee (ArrayList)\n"
                    + "2. Add Part-time Employee (ArrayList)\n"
                    + "3. Show all Full-time Employee\n"
                    + "4. Show all Part-time Employee\n"
                    + "5. Show all Employee\n"
                    + "6. Search Employee by Id\n"
                    + "7. Delete Employee by Id\n"
                    + "8. Edit Employee information by Id\n"
                    + "9. Search Employee by payment\n"
                    + "10. Sort Full-time Employee and Part-Time employee in ascending order by age, payment\n"
                    + "11. Exit\n" + "Input: ");

            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    hr.inputFullTimeList();
                    break;

                case 2:
                    hr.inputPartTimeList();
                    break;

                case 3:
                    hr.outputFullTimeList();
                    break;

                case 4:
                    hr.outputPartTimeList();
                    break;

                case 5:
                    hr.outputAll();
                    break;

                case 6:
                    hr.searchById();
                    break;

                case 7:
                    hr.deleteById();
                    break;

                case 8:
                    hr.editInfoById();
                    break;

                case 9:
                    hr.searchByPayment();
                    break;
                case 10:
                    hr.sortAcs();
                    break;

            }
        } while (menu != 11);

    }
}
