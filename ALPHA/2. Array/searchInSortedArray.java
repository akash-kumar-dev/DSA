public class searchInSortedArray {

    public static boolean bruteForceMethod (int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Key Found at (" + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("Key not found..");
        return false;
    }

    public static boolean binarySearch (int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;

                if (key == arr[i][mid]) {
                    System.out.println("Key Found at (" + i + "," + mid + ")");
                    return true;
                }

                if (key > arr[i][mid]) {
                    start = mid + 1;
                }

                if (key < arr[i][mid]) {
                    end = mid - 1;
                }
            }
        }

        System.out.println("Key NOT Found");
        return false;
    }

    public static boolean stairCaseSearch (int arr[][], int key) {

        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >=0) {
            if (arr[row][col] == key) {
                System.out.println("Key Found at (" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("Key NOT Found...");
        return false;
    }

    public static void main(String args[]) {
        int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 17, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 33;

        // bruteForceMethod(arr, key);
        // binarySearch(arr, key);
        stairCaseSearch(arr, key);
    }
}