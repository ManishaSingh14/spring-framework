package listanddate;

import java.util.Iterator;
import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private Department department;
    private List<String> taskList;

    public Employee() {
    }

    public Employee(Department department,List taskList) {
        this.department = department;
        this.taskList = taskList;
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
    public void show()
    {
        Iterator itr = taskList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("name=" + name + '\'' + ",age=" + age + ",salary=" + salary + ",departmentName=" + department.toString());


    }

//    public String toString() {
//
//        return "employee{" + "name=" + name + '\'' + ",age=" + age + ",salary=" + salary + ",departmentName=" + department + '}';
//    }
    }

