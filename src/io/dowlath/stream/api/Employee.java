package io.dowlath.stream.api;


import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String dept;
    private long salary;

    public Employee() {
    }

    public Employee(int id, String name, String dept, long salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dept, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
