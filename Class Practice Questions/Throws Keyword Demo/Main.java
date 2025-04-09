// WAP to demonstate throws keyword
import java.util.*;

class Main {
    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = divide(dividend, divisor);
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
