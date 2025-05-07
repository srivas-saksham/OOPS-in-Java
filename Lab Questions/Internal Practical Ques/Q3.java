//WAP to implement 3 Threads in java
import java.util.*;

class A extends Thread{
    public void run(){
        for(int i=0; i < 5; i++){
            System.out.println("Inside Thread A, Value: " + i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=6; i < 10; i++){
            System.out.println("Inside Thread B, Value: " + i);
        }
    }
}
class C extends Thread{
    public void run(){
        for(int i=11; i < 15; i++){
            System.out.println("Inside Thread C, Value: " + i);
        }
    }
}
class Q3{
    public static void main(String[] args){
        A obA = new A();
        B obB = new B();
        C obC = new C();

        A.start();
        B.start();
        C.start();
    }
}