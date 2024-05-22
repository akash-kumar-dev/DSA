// https://leetcode.com/problems/palindrome-number/

public class palindromeNumber{

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int y  = x;
        int palindromeNum = 0;
        while(x > 0) {
            int lastNum = x % 10;
            palindromeNum = (palindromeNum * 10) + lastNum;
            x = x/10;
        }

        if(palindromeNum == y) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 11211;
        System.out.println(isPalindrome(x));
    }
}

/*

// 9. Palindrome Number

// Easy

// Given an integer x, return true if x, return true if x is a palindrome and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

// Constraints:

// -231 <= x <= 231 - 1

 
 */