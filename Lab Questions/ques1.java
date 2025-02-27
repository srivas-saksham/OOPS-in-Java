// WAP if a number is divisible by 3 and 7 both.
import java.util.*;
class ques1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find if a number is divisible by 3 and 7 both. \n");
        System.out.print("Enter Number: ");
        int a = sc.nextInt();
        if(a%3==0 && a%7==0){
            System.out.println(a+" is divisible by 3 and 7 both.");
        }
        else{
            System.out.println(a+" is NOT divisible by 3 and 7");
        }
    }
}