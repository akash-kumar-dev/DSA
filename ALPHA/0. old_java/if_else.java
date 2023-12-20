import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Input integer Variable a : ");
        a = sc.nextInt();
        System.out.print("Input integer variable b : ");
        b = sc.nextInt();

        if (a > b)
            System.out.println("variable A is greater than B");
        else
            System.out.println("Variable B is greater than A");
    }
}