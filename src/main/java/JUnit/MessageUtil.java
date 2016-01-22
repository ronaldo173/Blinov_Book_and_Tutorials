package JUnit;

/**
 * Created by Santer on 21.01.2016.
 */
public class MessageUtil {

    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
}
