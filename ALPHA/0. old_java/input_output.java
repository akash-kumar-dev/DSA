import java.util.*;

public class input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, gender;
        int Age;
        System.out.print("Input Full Name : ");
        name = sc.nextLine();
        System.out.print("Input Age : ");
        Age = sc.nextInt();
        System.out.print("Input Gender : ");
        gender = sc.next();

        System.out.println("Name , Age , Gender : ");
        System.out.println(name + " " + Age + " " + gender);

    }
}