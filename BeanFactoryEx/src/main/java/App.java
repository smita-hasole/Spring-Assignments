import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
            Hello objA = (Hello) context.getBean("hello");

            objA.setMessage(" Contents of Hello's Singleton bean");
            objA.getMessage();

            Hello objB = (Hello) context.getBean("hello");
            objB.getMessage();
        }
    }


