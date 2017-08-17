import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Hello objA = (Hello) context.getBean("hello");

        //objA.setMessage("Hello World!!!");
        objA.getMessage();

        Hello objB = (Hello) context.getBean("hello");
        objB.setMessage("Hello!!!");
        objB.getMessage();

        Hello objC = (Hello) context.getBean("hello");
        objC.getMessage();
    }
}