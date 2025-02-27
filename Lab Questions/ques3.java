// WAp that checks wherether a number is divisible by 5, use ternary operator.
import java.util.*;
class ques3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Divisible by 5?");
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        String ans = (n % 5 == 0) ? "Yes "+n  : "No " +n;
        System.out.println(ans+" is divisible by 5");
    }
}