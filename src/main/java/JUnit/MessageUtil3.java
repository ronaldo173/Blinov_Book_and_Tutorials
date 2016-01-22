package JUnit;

/**
 * Created by Santer on 21.01.2016.
 */
public class MessageUtil3 {
    private String message;

    public MessageUtil3(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println(message);
        int a = 0;
        int b = 1 / a;
    }

    public String salutationMessage() {
        message = "hi " + message;
        System.out.println(message);
        return message;
    }
}
