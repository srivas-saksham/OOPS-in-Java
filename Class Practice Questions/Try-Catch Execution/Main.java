// Write a Java program that throws an exception and catch it using a try-catch block.
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        try{
            int result = dividend / divisor;
            System.out.println("Result is: " + result);
        }
        catch(Exception e){
            System.out.println("Error Caught: " + e);
        }

    }
}