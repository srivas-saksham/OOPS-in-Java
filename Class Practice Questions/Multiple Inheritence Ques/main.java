// WAP that implements Multiple Inheritence
import java.util.*;

interface Perimeter {
    void calcPerimeter();
}

interface Area {
    void calcArea();
}

class Rectangle implements Perimeter, Area {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calcPerimeter() {
        System.out.println("Perimeter is: " + (2 * (length + width)));
    }

    public void calcArea() {
        System.out.println("Area is: " + (length * width));
    }
}

public class main {
    public static void main(String[] args) {
        Rectangle ob = new Rectangle(15.5, 30);

        ob.calcPerimeter();
        ob.calcArea();
    }
}
