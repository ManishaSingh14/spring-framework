package configuration;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Department {
    @Value("HR")
    private String departmentName;

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    public String toString(){

        return " "+departmentName;
    }
}

