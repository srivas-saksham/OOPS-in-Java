// WAP to accept 3 sides of a triangle and check if its a icoceles scalene or equilateral.
import java.util.*;
class ques2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Checking Type of Triangle");
        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        if(a==b && b==c)
        System.out.println("Triangle is Equilateral");
        else if(a==b || b==c || c==a)
        System.out.println("Triangle is Isosceles");
        else
        System.out.println("Triangle is Scalene");       
    }
}