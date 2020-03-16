package entity;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Employee {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    @Value("${salary}")
    private double salary;
    private Department department;

    public Employee(){
        System.out.println("employee");

    }
    public Employee(Department department)
    {
        this.department=department;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String toString(){
        return "employee { " + "name= " +name+'\''+", age= "+age+", salary= "+salary+", departmentName=" +department+'}';
    }

}
