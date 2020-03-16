package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

@Bean
    public Employee getEmployee()
{
    System.out.println("employee bean");
        return new Employee(getDepartment());
}
@Bean
    public Department getDepartment(){
    System.out.println("department bean");
         return new Department();
    }
}
