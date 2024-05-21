# Maths Basic

1. ReverseNumber.java <a href="https://leetcode.com/problems/reverse-integer/">LeetCode Problem</a> 

2. plaindrome Number <a href="https://leetcode.com/problems/palindrome-number/">LeetCode Problem</a>
<hr>

 3. 2413. smallest Even Multiply <a href="https://leetcode.com/problems/smallest-even-multiple/">Leetcode Problem</a>
 
4. 66. Plus One <a href="https://leetcode.com/problems/plus-one/">Leetcode Problem</a>

### Notes 1.ReverseNumber.java

## Note: Avoiding Integer Overflow in Java Reverse Function

**Problem:** Reversing a 32-bit signed integer in Java can lead to overflow if the reversed number is too large.

**Cause:** Using `int` for calculations can't handle large intermediate values during reversal.

**Solution:**

1. Use `long` for the variable storing the reversed number (`reversed`) during calculations.
2. Cast the final `long` value back to `int` before returning for compatibility.

**Prevention Tips:**

- Consider `long` or `BigInteger` for potentially large numbers.
- Implement overflow checks when possible.
- Explore libraries like `java.math` for safe large number handling.
