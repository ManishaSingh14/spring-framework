package configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Employee {

    @Value("abcd")
    private String name;
    @Value("23")
    private int age;
    @Value("50000")
    private String salary;
    Department department;

public Employee(){
    System.out.println("working with java configuration");
}
public Employee(Department department){
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String toString(){
        return "employee { name: " +name+ " age: " +age+ " salary: " +salary+ " department: " +department+ "}";
    }
}
