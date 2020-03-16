package bean;

import org.springframework.beans.factory.annotation.Required;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private Department department;

public Employee(){

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
    return "employee{"+"name="+name+'\''+",age="+age+",salary="+salary+",departmentName="+department+'}';
    }
}