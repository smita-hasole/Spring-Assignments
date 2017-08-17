import org.springframework.beans.factory.annotation.Value;


public class Greet {
    String message;
@Value("hi Good morning")
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println(" Message is: " + message);
    }
}
