// WAP that accepts an operator from the user (+, -, *, /) and performs mathematical functions, use switchcase.
import java.util.*;
class ques5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arthematic Operations");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                    }
                else {
                    System.out.println("Error! Division by zero is not allowed.");
                    }
                break;
            default:
                System.out.println("Error! Invalid operator.\nPlease enter a valid operator (+, -, *, /)");
                break;
        }
    }
}