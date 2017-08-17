import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryEx {
        public static void main(String[] args) {
            XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Bean.xml"));
            Hello obj = (Hello) factory.getBean("hello");
            obj.setMessage("Contents of Hello's Singleton bean Factory");
            obj.getMessage();
        }
    }

