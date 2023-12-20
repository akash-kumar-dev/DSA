import java.util.*;

public class searchingAlgo {
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array[] = { 4, 8, 2, 7, 33, 21, 76, 332 };
        int array2[] = { 2, 5, 8, 10, 23, 27, 39 };
        int key = 27;
        System.out.println(binarySearch(array2, key));
    }
}
