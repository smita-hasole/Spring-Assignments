import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private AnnotationConfigApplicationContext context;

    public static void main(String[] args) {
        App app = new App();
         ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class,config.class,conf.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(HelloConfiguration.class);
//
//        context.refresh();
        Hello helloWorld =(Hello) context.getBean( Hello.class);
        helloWorld.setMessage(" Contents of Hello's prototype bean");
        helloWorld.getMessage();
        Hello hello = context.getBean(Hello.class);
        //.setMessage("Hello World bbbbbbbb!");
        hello.getMessage();
        //context.register(config.class);
        greet gt = (greet)context.getBean(greet.class);
        gt.getMessage();

hhhhh h =(hhhhh)context.getBean(hhhhh.class);
h.getMessage();
    }
}
