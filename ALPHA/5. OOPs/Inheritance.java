public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        shark.eat();

        /*
            Inheritance is when properties & Method of base class are passed on to a derived class.
        // Tpes of Inheritance
        1. Single level Inheritance
        2. Multi Level Inheritance
        3. Hierarchial Inheritance
        4. Hybrid Inheritance


        // MultiLevel Inheritance -> in JAVA use by Interfaces (in C/C++ this is a type of Inheritance)
        */
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived Class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
