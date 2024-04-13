public class SuperKeyword {
    public static void main(String args[]) {
        Horse H = new Horse();

        System.out.println(H.color);

    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        super();    // calling direct to it's parent (Animal class constructor)
        super.color = "brown";  // Accessing propery of parent class immidiately
        System.err.println("Horse constructor is called");
    }
}