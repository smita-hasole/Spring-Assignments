import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


    @Configuration
    public class Config {
        @Bean(name="greetBean")
        @Scope("prototype")  // by defalut scope is singleton
        public Greet helloWorld(){
            return new Greet();
        }
    }


