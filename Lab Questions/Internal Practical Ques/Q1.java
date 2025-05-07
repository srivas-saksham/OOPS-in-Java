//WAP to implement constructor overloading
import java.util.*;

class Sum{
    Sum(int a, int b){
        System.out.println(a + "+" + b + "=" + (a+b));
    }

    Sum(int a, int b, int c){
        System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c));
    }
}
public class Q1 {
    public static void main(String[] args){
        Sum ob1 = new Sum(10, 20);
        Sum ob2 = new Sum(20,30,40);
    }
}