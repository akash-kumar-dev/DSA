// given a String s containing just the character '(', ')', '{', '}', '[', ']'
// determine if the input string is valid, An input String is valid if:
// - Open bracket must be closed by the same type of bracket
// - Open bracket must be closed in correct order
// - Every close bracket has a corresponding open bracket of same type.

import java.util.*;

public class _8_ValidParantheses {
    public static boolean isValid(String str) { // O(n)
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') { // Opening
                s.push(ch);
            } else { // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str1 = "({})[]"; // true
        String str2 = "(({})[]"; // false
        String str3 = "()({})[]"; // true
        String str4 = "[]"; // true

        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
        System.out.println(isValid(str3));
        System.out.println(isValid(str4));
    }
}
