package org.example;

import configuration.Employee;
import configuration.EmployeeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee e= (Employee) ctx.getBean("getEmployee");
        System.out.println(e);

        //((AnnotationConfigApplicationContext) ctx).register(EmployeeConfig.class);
        //((AnnotationConfigApplicationContext) ctx).refresh();
        //((AnnotationConfigApplicationContext) ctx).close();

    }
}
