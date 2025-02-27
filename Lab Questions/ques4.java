// WAP that finds maximum of three numbers, using ternary operator.
import java.util.*;
class ques4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum of Three Numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c? b : c);
        System.out.println("Maximum of three numbers is: "+max);
    }
}