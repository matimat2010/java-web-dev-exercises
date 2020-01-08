package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentID, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }


    public String getName() { return name; }
    public int getStudentId() { return studentId; }
    public int getNumberOfCredits() { return numberOfCredits; }
    public double getGpa(){ return gpa; }


    public void setName(String name) { this.name = name; }
    public void setStudentId(int studentID) { this.studentId = studentID; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    private void setNumberOfCredits(int numberOfCredits) {this.numberOfCredits = numberOfCredits; }



}







