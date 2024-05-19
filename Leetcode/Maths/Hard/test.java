// https://leetcode.com/problems/number-of-digit-one/
// TIme Exceed

public class test {

    public static int countDigitOne(int n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                if (rem == 1) {
                    count++;
                }
                temp = temp / 10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(824883294));
    }
}

/*
 * // * 233. Number of Digit One
 * // Hard
 * 
 * // Given an integer n, count the total number of digit 1 appearing in all
 * non-negative integers less than or equal to n.
 * 
 * 
 * 
 * // Example 1:
 * 
 * // Input: n = 13
 * // Output: 6
 * // Example 2:
 * 
 * // Input: n = 0
 * // Output: 0
 * 
 * 
 * // Constraints:
 * 
 * // 0 <= n <= 109
 * //
 */