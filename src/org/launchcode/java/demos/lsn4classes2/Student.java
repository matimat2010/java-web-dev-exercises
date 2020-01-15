package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    private String gradeLevel;
    private double currentGrade;


    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.currentGrade = currentGrade;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        if (numberOfCredits < 30 ){
            this.gradeLevel = "Freshman";
        }else if ((numberOfCredits > 29) && (numberOfCredits < 60)) {
            this.gradeLevel = "Sophomore";

        }else if ((numberOfCredits > 59) && (numberOfCredits < 90)) {
            this.gradeLevel = "Junior";

        } else this.gradeLevel = "Senior";

        return gradeLevel;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        this.numberOfCredits = numberOfCredits + courseCredits;
        this.currentGrade = currentGrade + (grade * courseCredits);
        this.gpa = currentGrade / numberOfCredits;
        //return gpa;

        // Update the appropriate fields: numberOfCredits, gpa
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return studentId == student.studentId &&
                numberOfCredits == student.numberOfCredits &&
                Double.compare(student.gpa, gpa) == 0 &&
                Double.compare(student.currentGrade, currentGrade) == 0 &&
                name.equals(student.name) &&
                gradeLevel.equals(student.gradeLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa, gradeLevel, currentGrade);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return this.getName() + "," + " Student Id:" + this.studentId +", is a " +this.getGradeLevel() + " with " + this.numberOfCredits +
                " credit(s) and a GPA  of " + this.gpa;
    }



    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a " +sally.getGradeLevel());
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        //System.out.println(sally.toString());
//        System.out.println(sally.gpa);
//        System.out.println(sally.currentGrade);
//        System.out.println(sally.numberOfCredits);
        System.out.println(sally.getGradeLevel());
    }
}
