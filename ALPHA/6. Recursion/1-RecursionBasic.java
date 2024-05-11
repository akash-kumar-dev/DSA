public class RecursionBasic {

    // Print Numbers from n to 1 (Decreasing Order)
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    // Print Numbers from 1 to n (increasing Order)
    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    // factorial of a Number
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // sum of n natural number
    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // calculate nth term in fibonacci
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check if Array is Sorted or not
    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length - 1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);
    }

    // find the first occurence of an element in an Array
    public static int firstOccurence(int arr[],int key, int i) {
        if(i == arr.length - 1) {
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    // last occurence of an element in an Array
    public static int lastOccurence(int arr[], int key, int i) {
        if(i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String args[]) {
        // int n = 10;
        // printInc(n);
        // System.out.println(fact(5));
        // System.out.println(calcSum(5));
        // System.out.println(fib(50));
        int arr[] = {1, 5, 3, 4};
        // System.out.println(isSorted(arr, 0));
        int arr2[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr2, 5, 0));
        System.out.println(lastOccurence(arr2, 5, 0));
    }
}