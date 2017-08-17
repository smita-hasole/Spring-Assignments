import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


    @Configuration
    public class config {
        @Bean(name="greetBean")
        @Scope("prototype")  // by defalut scope is singleton
        public greet helloWorld(){
            return new greet();
        }
    }


