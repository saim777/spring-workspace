import beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String...x){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");

        var stud=(Student)context.getBean("student");

        System.out.println(stud +" "+stud.firstName+" : "+stud.id);



    }
}
