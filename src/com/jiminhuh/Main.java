package com.jiminhuh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1,"Lizzy", 35000);
        Teacher melissa = new Teacher(2,"Melissa", 45000);
        Teacher john = new Teacher(3,"John", 47000);

        Student jimin = new Student(1,"Jimin", 12);
        Student daniel = new Student(2, "Daniel", 11);
        Student tammy = new Student(3, "Tammy", 9);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(john);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jimin);
        studentList.add(daniel);
        studentList.add(tammy);

        School MHS = new School(teacherList, studentList);

        System.out.println("MHS has earned : $" + MHS.getTotalMoneyEarned());
        System.out.println(MHS.getTeachers());
    }
}
