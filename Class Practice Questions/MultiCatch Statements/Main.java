// WAP to showcase Multicatch statements
import java.util.*;

class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class PasswordExpection extends Exception{
    public PasswordExpection(String msg){
        super(msg);
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Password: ");
        String pass = sc.next();

        try{
            if(age < 18){
                throw new UnderAgeException("Age Should be 18 or More");
            }
            if(!pass.equals("JAVA")){
                throw new PasswordExpection("Incorrect Password");
            }
            System.out.println("Access Granted!");
        }
        catch(UnderAgeException e){
            System.out.println("Age Error: " + e.getMessage());
        }
        catch(PasswordExpection e){
            System.out.println("Password Error: " + e.getMessage());
        }
    }
}