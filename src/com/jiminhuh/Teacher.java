package com.jiminhuh;

/**
 * This Class is responsible for keeping track of teachers id, name and salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher object
     * @param id
     * @param name
     * @param salary
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Return name, id and salary values for current teacher.
     * @return
     */

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getSalary() {
        return this.salary;
    }

    /**
     * Set salary of teacher.
     * @param salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
