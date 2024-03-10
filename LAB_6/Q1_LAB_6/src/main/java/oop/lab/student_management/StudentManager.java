/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lab.student_management;

import java.io.Serializable;
/**
 *
 * @author hanie
 */
import java.util.*;

public class StudentManager implements Serializable {

    public StudentManager() {
    }

    static Scanner sc = new Scanner(System.in);

    // khởi tạo biến list
    public ArrayList<Student> listStudent = new ArrayList<Student>();

    // check existed & add
    public boolean addStudent(Student stu) {
        for (Student s : listStudent) {
            if (s.getStudentID().equalsIgnoreCase(stu.getStudentID())) {
                return false;
            }
        }
        listStudent.add(stu);
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
