// Min Sum Absolute Difference Pairs
// given two arrays A and B of equal length n.
// pair each element of Array A to an element in Array B,
// such that sum S of absolute difference of all the pairs is minimum.

import java.util.Arrays;

public class _3_Maximum_absolute_sum_difference_pairs {
    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min absolute diff. of pairs = " + minDiff);
    }
}
