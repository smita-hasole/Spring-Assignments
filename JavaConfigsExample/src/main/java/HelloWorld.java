import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
    String message;
    @Value("hi morning")
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println(" Message is: " + message);
    }
}

