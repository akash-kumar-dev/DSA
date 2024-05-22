// https://leetcode.com/problems/plus-one/

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            printArr(digits);
            return digits;
        }

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update digit with new value
            carry = sum / 10; // Calculate carry-over

            // If no more carry-over, return the modified array
            if (carry == 0) {
                printArr(digits);
                return digits;
            }
        }

        // Handle overflow of the most significant digit
        int[] result = new int[digits.length + 1]; // Create new array with extra digit
        result[0] = 1; // Set the new most significant digit to 1
        System.arraycopy(digits, 0, result, 1, digits.length); // Copy original digits
        printArr(result);
        return result;

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = {1,2,3};
        int[] arr = { 9, 9, 9 };
        // int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // int[] arr = { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9,
        // 5, 7, 7, 4, 7, 4, 9, 4, 7, 0, 1, 1,1, 7, 4, 0, 0, 6 };
        plusOne(arr);
    }
}

/*
 * You are given a large integer represented as an integer array digits, where
 * each digits[i] is the ith digit of the integer. The digits are ordered from
 * most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * Example 2:
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * Example 3:
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * 
 * 
 * Constraints:
 * 
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */