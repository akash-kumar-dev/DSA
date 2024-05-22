// https://leetcode.com/problems/reverse-integer/

public class ReverseNumber {

    public static int reverse(int x) {
        long reversed = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            reversed = reversed * 10 + pop;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }

            x /= 10;
        }

        return (int) reversed;
    }

    public static void main(String args[]) {
        System.out.println(reverse(1534236469)); // Now returns 0 (overflow)
    }
}


/*
 * // Notes
 * 
 * Note: Avoiding Integer Overflow in Java Reverse Function
Problem: Reversing a 32-bit signed integer in Java can lead to overflow if the reversed number is too large.

Cause: Using int for calculations can't handle large intermediate values during reversal.

Solution:

Use long for the variable storing the reversed number (reversed) during calculations.
Cast the final long value back to int before returning for compatibility.
Prevention Tips:

Consider long or BigInteger for potentially large numbers.
Implement overflow checks when possible.
Explore libraries like java.math for safe large number handling.


--------------------------------------------


// 7. Reverse Integer

// Medium

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:
// -231 <= x <= 231 - 1



 * 
*/