package entity;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class Department {
    @Value("${departmentName}")
    private String departmentName;
    @Value("${date}")
    private Date createdon;
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String toString(){
        return "  "+departmentName+" date "+createdon;
    }
}

