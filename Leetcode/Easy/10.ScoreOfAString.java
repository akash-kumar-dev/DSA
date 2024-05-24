// https://leetcode.com/problems/score-of-a-string/ 3110

class ScoreOfAString {
    public int scoreOfString(String s) {
        int size = s.length();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) s.charAt(i);
        }

        int score = 0;
        for (int i = 0; i < size - 1; i++) {
            int temp = arr[i] - arr[i + 1];
            if (temp >= 0) {
                score = score + temp;
            } else {
                temp = -temp;
                score = score + temp;
            }
        }

        return score;
    }
}

/*
 * 3110 
 * You are given a string s. The score of a string is defined as the sum of the
 * absolute difference between the ASCII values of adjacent characters.
 * 
 * Return the score of s.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "hello"
 * 
 * Output: 13
 * 
 * Explanation:
 * 
 * The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108,
 * 'o' = 111. So, the score of s would be |104 - 101| + |101 - 108| + |108 -
 * 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 * 
 * Example 2:
 * 
 * Input: s = "zaz"
 * 
 * Output: 50
 * 
 * Explanation:
 * 
 * The ASCII values of the characters in s are: 'z' = 122, 'a' = 97. So, the
 * score of s would be |122 - 97| + |97 - 122| = 25 + 25 = 50.
 * 
 * 
 * 
 * Constraints:
 * 
 * 2 <= s.length <= 100
 * s consists only of lowercase English letters.
 */