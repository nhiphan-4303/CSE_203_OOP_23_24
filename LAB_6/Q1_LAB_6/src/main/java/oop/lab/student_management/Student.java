/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package oop.lab.student_management;

/**
 *
 * @author hanie
 */
import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {

    static Scanner sc = new Scanner(System.in);

    // khởi tạo biến
    protected String studentID;
    protected String lastName;
    protected String midName;
    protected String firstName;
    protected int yearOfBirth;
    protected String gender;
    protected String schoolStage;

    // constructer rỗng
    public Student() {

    }
    // constructer mặc định

    public Student(String studentID, String lastName, String midName, String firstName, int yearOfBirth, String gender,
            String schoolStage) {
        this.studentID = studentID;
        this.lastName = lastName;
        this.midName = midName;
        this.firstName = firstName;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.schoolStage = schoolStage;
    }
    // get set từng biến

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchoolStage() {
        return schoolStage;
    }

    public void setSchoolStage(String schoolStage) {
        this.schoolStage = schoolStage;
    }

}
