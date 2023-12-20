import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());

        for (int i = 0; i < str.length() / 2; i++) {
            char ini = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            str.setCharAt(i, end);
            str.setCharAt(str.length() - 1 - i, ini);
        }

        System.out.println(str);
    }
}