package bean;

import bean.Department;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private String name;
    private int age;
    private double salary;
    Department department;

    public Employee(Department department){
        this.department=department;
    }
    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    @Required
    public void setAge(int age) {
        this.age = age;
    }

    @Required
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
  public String toString(){
      return "employee{"+"name="+name+'\''+",age="+age+",salary="+salary+",departmentName="+department+'}';
  }
    }
