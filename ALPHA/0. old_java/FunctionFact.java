import java.util.*;

public class FunctionFact {
    public static int fact(int n) {
        if (n < 0) {
            System.out.println("Invalid Input");
            return -1;
        }
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Input an Number : ");
        a = sc.nextInt();
        System.out.println("factorial is : " + fact(a));
    }
}