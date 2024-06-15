/* 
 * Leetcode: https://leetcode.com/problems/search-in-rotated-sorted-array/
 * 
 * Search in Roted Sorted Array
 * 
 * sorted, rotated Arary with distinct numbers (in Assending Order).
 * It is rotated at a pivot point. find the index of given element
 * 
 * Ex:  4,5,6,7,0,1,2
 * Target: 0
 * 
 * output -> 2
 */

public class searchInRotatedSortedArray {

    public static int search(int arr[], int tar, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2; // (si+ei)/2

        // case found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on Line 1
        if (arr[si] <= arr[mid]) {
            // case a: Left of L1
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // case b: Right
                return search(arr, tar, mid + 1, ei);
            }
        }

        // Mid on Line 2
        else {
            // case c: right of L2
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d: left
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0; // output -> 4

        System.out.println(search(arr, target, 0, arr.length - 1));
    }
}
