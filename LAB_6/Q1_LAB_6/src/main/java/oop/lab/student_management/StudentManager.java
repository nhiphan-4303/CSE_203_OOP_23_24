/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.student_management;

/**
 *
 * @author hanie
 */
import java.util.*;

public class StudentManager {

    public StudentManager() {
    }

    static Scanner sc = new Scanner(System.in);

    // khởi tạo biến list
    protected ArrayList<Student> listStudent = new ArrayList<Student>();

    // check existed & add
    public boolean addStudent(Student stu) {
        for (Student s : listStudent) {
            if (s.getStudentID().equalsIgnoreCase(stu.getStudentID())) {
                return false;
            }
        }
        return true;
    }

    // find by ID
    public Student findStudentById(String studentID) {
        for (Student s : listStudent) {
            if (s.getStudentID().equalsIgnoreCase(studentID)) {
                return s;
            }
        }
        return null;
    }

    // list
    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

}
