package model;

public class Employee {
   private String name;
   private int age;
   private String college;
   private String city;

   public Employee(){

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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String toString(){
       return "name: "+name+ "age: " +age+ "college: " +college+ "city: " +city;
    }
}
