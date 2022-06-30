package io.dowlath.stream.api;

import java.util.Objects;

public class Emp {

    private int id;
    private String name;
    private String grade;
    private double salary;


    public Emp() {
    }


    public Emp(int id, String name, String grade, double salary) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Double.compare(emp.salary, salary) == 0 && Objects.equals(name, emp.name) && Objects.equals(grade, emp.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grade, salary);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
