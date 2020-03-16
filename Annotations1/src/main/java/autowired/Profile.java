package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Profile {

//    @Qualifier("student1")
    @Autowired
    private Student student;

    public Profile() {
        System.out.println("Inside Profile constructor.");
    }

    public void printAge()
    {
        System.out.println("Age : " + student.getAge());
    }

    public void printName() {

        System.out.println("Name : " + student.getName());
    }
}
