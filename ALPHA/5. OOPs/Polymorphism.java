public class Polymorphism {
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        // Function Overloading -> compile time Overloading
        System.out.println(calc.sum(2,3));
        System.out.println(calc.sum((float)2.5,(float)3.5));
        System.out.println(calc.sum(2,3,4));

        // Method Overriding -> (Run Time Overloading)
        Deer D1 = new Deer();
        D1.eat();   // Executes child class function
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
