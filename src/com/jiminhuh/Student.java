package com.jiminhuh;

/**
 * This is a Student Class that is responsible for keeping track of students fees, name, grade and fees paid
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /* To Create a new Student Object by initializing*
    Fees for every student is $30,000.
    Fees paid initially will be $0.00.
    @param id: id for the student unique.
    @param name: name of the student.
    @param grade: grade of the student.
     */

    public Student(int id, String name, int grade) {

        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    // Not going to alter student's name or id.
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Add the fees to the fees Paid.
    // This code is going to receive the funds.
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    /**
     * Return id, name, grade, feesPaid and feesTotal of current Student.
     * @return
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
}
