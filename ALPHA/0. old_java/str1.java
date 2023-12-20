import java.util.*;

public class str1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, reverse;
        System.out.print("Input a String : ");
        s1 = sc.next();

        for (int i = 0; i < s1.length(); i++) {
            reverse.charAt(i) = s1.charAt(s1.length() - i);
        }

        System.out.println("Reverse String : " + reverse);
    }
}