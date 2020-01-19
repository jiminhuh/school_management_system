package com.jiminhuh;

import java.util.List;

public class School {

    /**
     * School can have many teachers and students.
     * Implement teachers and students using an ArrayList.
     */

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * A new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Get teachers list, students list, totalMoneyEarned and totalMoneySpent.
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Set teacher list, student list, totalMoneyEarned and totalMoneySpent.
     * @param teachers
     */

    public void addTeacher(Teacher teachers) {
        this.teachers.add(teachers);
    }

    public void addStudent(Student students) {
        this.students.add(students);
    }

    public void updateTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }

    public void updateTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent += totalMoneySpent;
    }
}
