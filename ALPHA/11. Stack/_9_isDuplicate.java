
/**
 * _9_isDuplicate
 * 
 * given a balanced expression, find if it contains duplicate parenthesis or not.
 * A set of parenthesis are duplicate if the same subexpression is surrounded by multiple paranthesis.
 * return a true if it contains duplicate else return false.
 */

import java.util.*;

public class _9_isDuplicate {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening pair
                }
            } else {
                // opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a+b)"; // false
        System.out.println(isDuplicate(str2));
    }

}