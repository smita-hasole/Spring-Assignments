import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

    @Configuration
    public class JavaConfiguration {
        @Bean(name="g")
        @Scope("prototype")  // by defalut scope is singleton
        public HelloWorld helloWorld(){
            return new HelloWorld();
        }
    }


