import java.util.*;

class Worker {
    protected int code;
    protected String name;
    protected float salary;

    void acceptVals() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Worker Code: ");
        code = sc.nextInt();
        System.out.print("Enter Worker Name: ");
        name = sc.next();
        System.out.print("Enter Worker Salary: ");
        salary = sc.nextFloat();
    }

    void displayWorker() {
        System.out.println("Worker Code: " + code);
        System.out.println("Worker Name: " + name);
        System.out.println("Worker Salary: " + salary);
    }
}

class Manager extends Worker {
    float TA;
    float grossSal;

    void calculateTA() {
        TA = 0.1f * salary;
        grossSal = TA + salary;
    }

    void displayManager() {
        System.out.println("TA: " + TA);
        System.out.println("Gross Salary: " + grossSal);
    }
}

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.acceptVals();
        manager.calculateTA();
        manager.displayWorker(); 
        manager.displayManager();
    }
}
