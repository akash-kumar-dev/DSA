import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Input Row and Column : ");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 0;i<a;i++){
            for(int i=0;i<b;i++){
                Sysytem.out.print("*");
            }
            System.out.print("\n");
        }
}