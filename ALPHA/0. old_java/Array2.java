import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Input Row and Column of MAtrix : ");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];

        System.out.println("Input First matrix Elements : ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m1[i][j] = sc.nextInt();

        System.out.println("input Second Matrix Elements : ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m2[i][j] = sc.nextInt();

        // Calculation of Sum
        System.out.println("Sum of Matrix m1 and m2  : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m1[i][j] + m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}