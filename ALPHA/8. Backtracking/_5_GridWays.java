// find numbers of ways to reach from (0,0) to (n-1,m-1) in a N*M grid
// Allowed moves right and down only

public class _5_GridWays {
    // Time Complexity: O(2^(n+m))  Exponential T.C.
    public static int gridWays(int i, int j, int n, int m) {
        // Base case
        if (i == n - 1 && j == m - 1) { // condition for last Cell
            return 1;
        } else if (i == n || j == m) {  // boundary cross condition
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;   // 6
        System.out.println(gridWays(0, 0, n, m));
    }
}
