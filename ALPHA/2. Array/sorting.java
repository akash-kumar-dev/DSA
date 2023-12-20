import java.util.Arrays;
import java.util.Collections;

public class sorting {

    public static void bubbleSort (int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void selectionSort (int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort (int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort (int arr[]) {
        // only for positive numbers and small range of numbers
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int arr[] = {8, 4, 7, 88 ,56, 1};

        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);

        // inbuild sorting

        /* Arrays.sort(arr);
        Arrays.sort(arr, 0, 4);     // 4 7 8 88 56 1

        Integer arr2[] = {7, 3, 6, 9, 1, 2};
        Arrays.sort(arr2, 0, 4, Collections.reverseOrder());    //8 4 7 88 56 1
        */


        countingSort(arr);

        printArray(arr);
    }
}