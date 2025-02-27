//WAP to create a class Rectangle with data member & member functions, use COnstrcutor.
import java.util.*;

class RectangleParam {
    //Data members
    private double length;
    private double width;

    //Constructor
    public RectangleParam() {
        length = 5;
        width = 10;
    }

    //Method to calculate area
    public double getArea() {
        return length * width;
    }

    //Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    //Method to display rectangle details
    public void display() {
        System.out.println("Rectangle Details:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
class RectangleDefaultQues{
    public static void main(String[] args) {
        System.out.println("Program to Print Area & Perimeter of Rectangle");

        RectangleParam rect = new RectangleParam();
        rect.display();
    }
}
