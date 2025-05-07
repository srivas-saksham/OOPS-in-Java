//WAP to showcase all uses of super keyword.
class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    Dog(String name) { super(name); }
    void sound() { super.sound(); System.out.println("Dog barks"); }
    void showName() { System.out.println(super.name); }
}

class Q2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound();
        dog.showName();
    }
}
