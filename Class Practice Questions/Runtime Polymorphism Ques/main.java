// WAP to implement run time polymorphism

import java.util.*;

class A{
    int A;
    void show(){
        System.out.println("Inside Class A");
    }
}
class B extends A{
    int B;
    void show(){
        System.out.println("Inside Class B");
    }
}
class main{
    public static void main(String[] args){
        A ref;
        B ob = new B();
        ref = ob;
        ref.show();
        ref = new A();
        ref.show();
    }
}