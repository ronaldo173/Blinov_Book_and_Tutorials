package JUnit;

/**
 * Created by Santer on 22.01.2016.
 */
public class PrimeNumberChecker {

    public boolean validate(final Integer primNumber) {
        for (int i = 2; i < primNumber / 2; i++) {
            if (primNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
