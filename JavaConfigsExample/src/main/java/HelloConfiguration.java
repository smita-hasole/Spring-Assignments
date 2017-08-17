import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class HelloConfiguration {
    @Bean
    @Scope("prototype")  // by defalut scope is singleton
    public Hello helloWorld(){
        return new Hello();
    }
}
