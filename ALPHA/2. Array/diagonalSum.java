import java.util.*;

public class diagonalSum {

    public static int diagonalSumFunc(int arr[][]) {
        int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; j++) {
        //         if (i == j) {
        //             sum += arr[i][j];
        //         }

        //         if (i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        for (int i = 0; i < arr.length; i++) {
            // sum of primary Diagno
            sum += arr[i][i];
            // sum of secondary diagno
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input n : ");
        // int n = sc.nextInt();

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println("Input Matrix Data : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum : " + diagonalSumFunc(arr));

    }
}
