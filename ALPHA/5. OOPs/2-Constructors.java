public class Constructors {
    public static void main(String args[]) {

        // Constructor
        Student s1 = new Student();
        Student s2 = new Student("abc");
        Student s3 = new Student(01);
        Student s4 = new Student("aman", 345);
        System.out.println(s2.name);

        // copy constructor
        Student a1 = new Student();
        a1.name = "abcd";
        a1.roll = 33;
        a1.password = "xyz";
        a1.marks[0] = 100;
        a1.marks[1] = 90;
        a1.marks[2] = 80;

        Student a2 = new Student(a1);
        a2.password = "abc";
        a1.marks[2] = 100;

        for (int i = 0; i <= 2; i++) {
            System.out.println(a2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    // Student(Student s) {
    //     marks = new int[3];
    //     this.name = s.name;
    //     this.roll = s.roll;
    //     this.marks = s.marks; // Reference copy
    // }

    // Deep copy constructor
    Student(Student s) {
        marks = new int[3];
        this.name = s.name;
        this.roll = s.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    // Non-parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    // Parameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

    Student(String name, int roll) {
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}
