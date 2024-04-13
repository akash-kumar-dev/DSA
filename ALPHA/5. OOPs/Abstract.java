public class Abstract {
    public static void main(String args[]) {

        // Animal a = new Animal(); // cannot create object of abstarct class
        Horse h = new Horse();
        h.eat();
        h.walk();

    }
}

abstract class Animal {
    String color;

    // can have constructors in Abstarct class
    Animal() {
        color = "brown";    // initilize the variables of child class
    }

    void eat() {
        System.out.println("Animal eats.");
    }

    abstract void walk(); // only the idea not implementation (NOT depends on Animal)
}

class Horse extends Animal {
    // implementation of idea given in Animal
    void walk() {
        System.out.println("Horse can walk");
    }
    void changeColor() {
        color = "white";
    }
}
