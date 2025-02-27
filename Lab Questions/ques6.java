// WAP that finds sum of N natural numbers. and sumn of (N^2) natural numbers.
import java.util.*;
class ques6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of N natural numbers and Sum of (N^2) Natural Numbers");
        System.out.print("Enter the Number of Natural Numbers: ");
        int n = sc.nextInt();
        int sum = (n*(n+1))/2;
        int sum2 = (n*(n+1)*(2*n+1))/6;
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
        System.out.println("Sum of squares of first "+n+" natural numbers is: "+sum2);
    }
}