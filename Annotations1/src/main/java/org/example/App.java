package org.example;

import autowired.Profile;
import autowired.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();
        System.out.println(profile.hashCode());

        //this for scope
        Profile profile1= (Profile) context.getBean("profile");
        profile1.printAge();
        profile1.printName();
        System.out.println(profile1.hashCode());
    }
}
