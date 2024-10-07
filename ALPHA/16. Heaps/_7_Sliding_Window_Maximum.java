
/**
 * Sliding Window Maximum
 * 
 * Maximum of all subarrays of size k
 * 
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10        k = 3
 * 
 * answer = 3, 4, 5, 6, 7, 8, 9, 10
 */

/**
 * Implements a sliding window maximum algorithm using a priority queue.
 * The algorithm finds the maximum value in each window of size k as the array is traversed.
 * The time complexity is O(n log k), where n is the length of the input array.
 */

import java.util.*;

public class _7_Sliding_Window_Maximum {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // ascending
            // return this.val - p2.val;

            // descending
            return p2.val - this.val;
        }
    }

    public static void main(String[] args) { // O(nlogk)
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3; // window size
        int res[] = new int[arr.length - k + 1]; // n-k+1

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for (int i = 0; i < k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for (int i = k; i < arr.length; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i - k + 1] = pq.peek().val;
        }

        // print result
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " "); // 3 3 5 5 6 7
        }
    }
}
