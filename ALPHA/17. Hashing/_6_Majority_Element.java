/*
 * Given an array of size n, find the majority element that appears more than n/3 times.
 * 
 * num[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}
 * // 1
 * 
 * nums[] = {1, 2}
 * // 1,2
 */

import java.util.*;

public class _6_Majority_Element {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            // if (map.containsKey(arr[i])) {
            // map.put(arr[i], map.get(arr[i]) + 1);
            // } else {
            // map.put(arr[i], 1);
            // }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Set<Integer> keySet = map.keySet();
        // for (Integer key : keySet) {
        // if (map.get(key) > arr.length / 3) {
        // System.out.println(key);
        // }
        // }

        for (Integer key : map.keySet()) {
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }
    }
}
