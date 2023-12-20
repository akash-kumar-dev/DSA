import java.util.*;

public class spiralMatrix {

    public static void spiralMatrixFunc(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // start Boundary top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Right Boundary
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Bottom Boundary
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // Left Boundary
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n m : ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("input Matrix Data : ");
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        spiralMatrixFunc(arr);

    }
}
