package org.launchcode.java.demos.lsn3classes1;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int creditValue;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName, int creditValue) {
        this.courseName = courseName;
        this.creditValue = creditValue;
    }

    public String getCourseName(){
        return courseName;
    }
    private void setCourseName(String aCourseName){
        courseName = aCourseName;
    }
    public int getCreditValue(){
        return creditValue;
    }
    private void setCreditValue(int aCreditValue){
        creditValue = aCreditValue;
    }
    public List<Student> getEnrolledStudents(){
        return enrolledStudents;
    }
    private void addStudent(Student aStudent){
        enrolledStudents.add(aStudent);
    }
}
