package org.example;

import bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Employee e=(Employee)ctx.getBean("emp");
        System.out.println(e);
    }
}
