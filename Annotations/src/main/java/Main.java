import bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e=(Employee)ctx.getBean("emp");
        System.out.println(e);
    }
}
