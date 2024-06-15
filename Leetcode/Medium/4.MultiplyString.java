// https://leetcode.com/problems/multiply-strings/

// 43. Multiply Strings

// Medium

// Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

// Example 1:

// Input: num1 = "2", num2 = "3"
// Output: "6"
// Example 2:

// Input: num1 = "123", num2 = "456"
// Output: "56088"
 

// Constraints:

// 1 <= num1.length, num2.length <= 200
// num1 and num2 consist of digits only.
// Both num1 and num2 do not contain any leading zero, except the number 0 itself.

class test {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1 = num1.length();
        int len2 = num2.length();
        int[] digits = new int[len1 + len2];

        // Iterate through each digit of num2 in reverse order
        for (int i = len2 - 1; i >= 0; i--) {
            int digit2 = num2.charAt(i) - '0';

            // Iterate through each digit of num1 in reverse order
            for (int j = len1 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(j) - '0';
                int product = digit1 * digit2;

                // Add the product to the appropriate position in the digits array, handling
                // potential carry
                int currentDigit = i + j + 1;
                digits[currentDigit] += product;
                while (digits[currentDigit] >= 10) {
                    digits[currentDigit - 1] += digits[currentDigit] / 10;
                    digits[currentDigit] %= 10;
                }
            }
        }

        // Build the result string by removing leading zeros
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (int digit : digits) {
            if (digit != 0 || !leadingZero) {
                result.append(digit);
                leadingZero = false;
            }
        }

        return result.toString().isEmpty() ? "0" : result.toString();
    }

    public static void main(String[] args) {
        multiply("12", "2");
    }
}