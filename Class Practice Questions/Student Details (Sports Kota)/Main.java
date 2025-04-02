/*
Consider a university where students who participate in the national games or Olympics are given some grace marks. 
Therefore, the final marks awarded = Exam_Marks + Sports_Grace_Marks. 
A class diagram representing this scenario is as follow;

Exam extends Students
Result extends Exams
Results implements Sports
*/

import java.util.Scanner;

class Students {
    protected int rollNo;
    protected String name;
    protected boolean isPlayer;

    Students(int rollNo, String name, boolean isPlayer) {
        this.rollNo = rollNo;
        this.name = name;
        this.isPlayer = isPlayer;
    }

    void displayStudents() {
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Exam extends Students {
    protected double phy, chem, maths, bio, eng, cs, total;

    Exam(int rollNo, String name, boolean isPlayer, double phy, double chem, double maths, double bio, double eng, double cs) {
        super(rollNo, name, isPlayer);
        this.phy = phy;
        this.chem = chem;
        this.maths = maths;
        this.bio = bio;
        this.eng = eng;
        this.cs = cs;
        this.total = phy + chem + maths + bio + eng + cs;
    }

    void displayMarks() {
        super.displayStudents();
        System.out.println("Physics: " + phy);
        System.out.println("Chemistry: " + chem);
        System.out.println("Maths: " + maths);
        System.out.println("Biology: " + bio);
        System.out.println("English: " + eng);
        System.out.println("Computer Science: " + cs);
        System.out.println("Total Marks: " + total);
    }
}

interface Sports {
    double getGraceMarks();
}

class Result extends Exam implements Sports {
    private double finalMarks;

    Result(int rollNo, String name, boolean isPlayer, double phy, double chem, double maths, double bio, double eng, double cs) {
        super(rollNo, name, isPlayer, phy, chem, maths, bio, eng, cs);
        double graceMarks = getGraceMarks();
        this.finalMarks = total + graceMarks;
    }

    @Override
    public double getGraceMarks() {
        return isPlayer ? 10.0 : 0.0;
    }

    void displayResult() {
        super.displayMarks();
        System.out.println("Sports Grace Marks: " + getGraceMarks());
        System.out.println("Final Marks (with grace): " + finalMarks);
    }
}

public class Main {
    static Result inputStdData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Has " + name + " participated in sports? (true/false): ");
        boolean isPlayer = sc.nextBoolean();

        System.out.print("Marks in Physics: ");
        double phy = sc.nextDouble();
        System.out.print("Marks in Chemistry: ");
        double chem = sc.nextDouble();
        System.out.print("Marks in Maths: ");
        double maths = sc.nextDouble();
        System.out.print("Marks in Biology: ");
        double bio = sc.nextDouble();
        System.out.print("Marks in English: ");
        double eng = sc.nextDouble();
        System.out.print("Marks in Computer Science: ");
        double cs = sc.nextDouble();

        return new Result(rollNo, name, isPlayer, phy, chem, maths, bio, eng, cs);
    }

    public static void main(String[] args) {
        Result student1 = inputStdData();
        // Result student2 = inputStdData();

        student1.displayResult();
        System.out.println("---------------------------");
        // student2.displayResult();
    }
}
