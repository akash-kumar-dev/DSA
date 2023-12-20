import java.util.*;

class student {
    String name;
    int age;
    float fee;

    //constructor properties -
    //1- constructors have no any return type.they will only construct the object
    //2- class name and constructor both will have same name
    //3- JAVA have no destructor
    student(){
        System.out.println("Default constructor Called");
    } //user defined defalt constructor non parametrised constructor

    student(String name,int age,float fee){
        this.name = name;
        this.age = age;
        this.fee = fee;
        System.out.println("parametrised constructor called.");
    }//Parametrised consturctor

    //copy construtcor
    //C++ have some dafualt copy constructor but java have only user defined copy constructor

    student(student s){
        this.name = s.name;
        this.age = s.age;
        this.fee = s.fee;
        System.out.println("copy constructor called");
    } //copy constructor;

    public void print_info() {
        System.out.println("Student name : "+this.name);
        System.out.println("Student age : "+this.age);
        System.out.println("Student FEE : "+this.fee);
    }
}

public class oops_constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student(); //non-paremetrised constructor
        student s2 = new student("parametrised",20,20000); //parametrised constructor
        student s3 = new student(s2); //copy constructor
        s1.name="Test Name";
        s1.age=20;
        s1.fee=45000;

        s1.print_info();
        s2.print_info();
        s3.print_info();

    }
}