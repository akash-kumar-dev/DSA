public class array2 {
    public static void subArrayPrintFunc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }

    public static int maxSubArraySum(int arr[]) { // Brute Force Method
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (maxSum < currSum) {
                    start = i;
                    end = j;
                    maxSum = currSum;
                }
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        return maxSum;
    }

    public static int prefixSumMethod(int arr[]) {      //prefix Sum Array Method
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[arr.length];

        prefixArray[0] = arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

        int start = 0, end = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                    start = i;
                    end = j;
                }
            }
        }
        for(int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        return maxSum;
    }

    public static int kadanesAlgoritham (int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int arr2[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("\n" + kadanesAlgoritham(arr2));
        System.out.println("\n" + prefixSumMethod(arr2));

    }
}