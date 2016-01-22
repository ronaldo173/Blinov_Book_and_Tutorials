package JUnit;

/**
 * Created by Santer on 21.01.2016.
 */
public class MessageUtil2 {

    private String message;

    public MessageUtil2(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
        while (true) ;
    }

    public String salutationMEssage() {
        message = "hi " + message;
        System.out.println(message);
        return message;
    }
}
