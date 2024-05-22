// https://leetcode.com/problems/rotate-image/

/* 
48.
 * You are given an n x n 2D matrix representing an image, rotate the image by
 * 90 degrees (clockwise).
 * 
 * You have to rotate the image in-place, which means you have to modify the
 * input 2D matrix directly. DO NOT allocate another 2D matrix and do the
 * rotation.
 * 
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [[7,4,1],[8,5,2],[9,6,3]]
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 
 * 
 * Constraints:
 * 
 * n == matrix.length == matrix[i].length
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 * 
 * 
 */

public class rotateImage {
    // public static void rotate(int[][] matrix) {
    // // Transpose Matrix
    // for (int i = 0; i < matrix.length/2; i++) {
    // for (int j = i; j < matrix[0].length; j++) {
    // int temp = 0;
    // temp = matrix[i][j];
    // matrix[i][j] = matrix[j][i];
    // matrix[j][i] = temp;
    // }
    // }
    // // Reverse Matrix
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix.length / 2; j++) {
    // int temp = 0;
    // temp = matrix[i][j];
    // matrix[i][j] = matrix[i][matrix.length - 1 - j];
    // matrix[i][matrix.length - 1 - j] = temp;
    // }
    // }
    // }

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {
                // Start 4 way swaps
                // temp = bottom left
                int temp = matrix[n - 1 - j][i];

                // bottom left = bottom right
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];

                // bottom right = top right
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];

                // top right = top left
                matrix[j][n - 1 - i] = matrix[i][j];

                // top left = temp
                matrix[i][j] = temp;
            }
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] m2 = { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };

        // printMatrix(m1);
        rotate(m2);
        printMatrix(m2);
    }
}