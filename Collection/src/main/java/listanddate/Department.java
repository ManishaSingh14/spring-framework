package listanddate;

import java.util.Date;

public class Department {
    private String departmentName;
   private Date dateCreatedon;

    public Date getDateCreatedon() {
        return dateCreatedon;
    }

    public void setDateCreatedon(Date dateCreatedon) {
        this.dateCreatedon = dateCreatedon;
    }

    public String getDepartmentName() {

        return departmentName;
    }

    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    public String toString(){

        return " "+departmentName+" date "+dateCreatedon;
    }
}
