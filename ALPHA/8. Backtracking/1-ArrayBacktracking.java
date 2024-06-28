public class ArrayBacktracking {

    public static void chaneArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        chaneArr(arr, i + 1, val + 1);  // function call step
        arr[i] = arr[i] - 2;    // BackTracking Step
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        chaneArr(arr, 0, 1);
        printArr(arr);
    }
}