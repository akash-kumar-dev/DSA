import java.util.Scanner;

public class dataType {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c = 'A';
        int check = (int)c;
        System.out.println(check);
        int count = 65;
        for(int i = 0; i < n ; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(count));
                count++;
            }
            System.out.println();
        }


        /*
        float var = 67.0656f;
        int num = (int)var;
        System.out.println(num);

        int n = sc.nextInt();
        String ans = (n%2==0) ? "Even" : "Odd";
        System.out.println(ans);
        */
    }

}