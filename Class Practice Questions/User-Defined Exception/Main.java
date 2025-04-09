// WAP to create a User defined exception: NoMatch Exception that is generated when string entered by the user is not equal to ABC
import java.util.*;

class NoMatchException extends Exception {
    public NoMatchException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();

        try {
            if (!str.equals("ABC")) {
                throw new NoMatchException("String NOT Equal to \"ABC\"");
            } 
            else {
                System.out.println("String matched: ABC");
            }
        } catch (NoMatchException e) {
            System.out.println("Caught NoMatch-Exception: " + e.getMessage());
        }
    }
}
