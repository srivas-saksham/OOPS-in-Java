//WAP to create a class Rectangle with data member & member functions, use COnstrcutor.
import java.util.*;

class RectangleParam {
    //Data members
    private double length;
    private double width;

    //Constructor
    public RectangleParam(double lengthI, double widthI) {
        length = lengthI;
        width = widthI;
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
class RectangleParamQues{
    public static void main(String[] args) {
        System.out.println("Program to Print Area & Perimeter of Rectangle");
        Scanner sc = new Scanner(System.in);
        double length, width;
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();

        RectangleParam rect = new RectangleParam(length, width);
        rect.display();
    }
}
