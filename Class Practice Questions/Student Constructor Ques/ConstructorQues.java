// WAP to that creates a class Students field names, roll no, mobile number, avg marks, and grade, and use default constructor.
import java.util.*;
class Students{
    private long rollNo;
    private String name;
    private long mobileNo;
    private double avgMarks;
    private char grade;

    Students(long rollNoI, String nameI, long mobileNoI, double avgMarksI, char gradeI){
        rollNo = rollNoI;
        name = nameI;
        mobileNo = mobileNoI;
        avgMarks = avgMarksI;
        grade = gradeI;
    }

    public void display(){
        System.out.println("\n Student Details: ");
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("Average Marks: "+avgMarks);
        System.out.println("Grade: "+grade);
    }
}
class ConstructorQues{
    public static void main(String[] args){
        long rollNo;
        String name;
        long mobileNo;
        double avgMarks;
        char grade;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLong();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Mobile Number: ");
        mobileNo = sc.nextLong();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        System.out.print("Enter Grade: ");
        grade = sc.next().charAt(0);

        Students stud1 = new Students(rollNo, name, mobileNo, avgMarks, grade);
        stud1.display();
    }
}