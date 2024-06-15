import java.util.Random;;

public class quickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // last element
        int pIdx = partition(arr, si, ei);

        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // to make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 8, 2, 5 };
        // printArr(arr);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        // printArr(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter");
        // printArr(numbers);
    }
}
