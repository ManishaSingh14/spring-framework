package bean;

public class Department {
    String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    public String toString(){
        return ""+departmentName;
    }
}
