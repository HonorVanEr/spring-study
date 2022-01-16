import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    public static void main(String[] args) {

        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("studentbeans.xml", "classtbeans.xml");

        Student student = (Student) applicationContext.getBean("student01");

        Student student01 = applicationContext.getBean("student01", Student.class);
        System.out.println(student == student01);

        System.out.println(student.getName());

        Class class01 = (Class) applicationContext.getBean("class01");
        System.out.println(class01.toString());
    }
}
