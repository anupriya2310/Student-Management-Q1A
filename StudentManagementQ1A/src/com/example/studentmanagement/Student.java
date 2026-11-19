
package com.example.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String studentName;
    private String emailAddress;
    private String courseName;
    private double programmingScore;
    private double mathematicsScore;
    private List<String> technicalSkills;

    // Default constructor
    public Student() {
        technicalSkills = new ArrayList<>();
    }

    // Parameterized constructor
    public Student(int studentId, String studentName,
            String emailAddress, String courseName,
            double programmingScore, double mathematicsScore,
            List<String> technicalSkills) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.emailAddress = emailAddress;
        this.courseName = courseName;
        this.programmingScore = programmingScore;
        this.mathematicsScore = mathematicsScore;
        this.technicalSkills = new ArrayList<>(technicalSkills);
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getProgrammingScore() {
        return programmingScore;
    }

    public void setProgrammingScore(double programmingScore) {
        this.programmingScore = programmingScore;
    }

    public double getMathematicsScore() {
        return mathematicsScore;
    }

    public void setMathematicsScore(double mathematicsScore) {
        this.mathematicsScore = mathematicsScore;
    }

    public List<String> getTechnicalSkills() {
        return new ArrayList<>(technicalSkills);
    }

    public void setTechnicalSkills(List<String> technicalSkills) {
        this.technicalSkills = new ArrayList<>(technicalSkills);
    }

    // Add skill
    public void addSkill(String skill) {
        technicalSkills.add(skill);
    }

    // Calculate average
    public double calculateAverage() {
        return (programmingScore + mathematicsScore) / 2;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Email: " + emailAddress);
        System.out.println("Course: " + courseName);
        System.out.println("Programming Score: " + programmingScore);
        System.out.println("Mathematics Score: " + mathematicsScore);
        System.out.println("Technical Skills: " + technicalSkills);
        System.out.println("Average: " + calculateAverage());
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId
                + "\nStudent Name: " + studentName
                + "\nEmail: " + emailAddress
                + "\nCourse: " + courseName
                + "\nTechnical Skills: " + technicalSkills;
    }
}
