// https://leetcode.com/problems/max-points-on-a-line/

public class maxPointOnALine {

    public static int maxPoints(int[][] points) {
        double[][] inputs = intToDouble(points);

        double[] slope = new double[points.length];
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            int maxCount = 0, idx = 0;
            for (int j = 0; j < points.length; j++) {
                slope[idx] = (inputs[i][1] - inputs[j][1]) / (inputs[i][0] - inputs[j][0]);
                idx++;
            }
            printArray(slope);
            maxCount = maxOccur(slope);
            System.out.println(max + " " + maxCount);
            if (maxCount > max) {
                max = maxCount;
            }

        }

        return max + 1;
    }

    public static double[][] intToDouble(int[][] arr) {
        double[][] copy = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                copy[i][j] = (double) arr[i][j];
            }
        }

        return copy;
    }

    public static int maxOccur(double[] arr) {
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (maxCount < count) {
                maxCount = count;
            }
        }

        return maxCount;

    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[][] points = { { 1, 1 }, { 2, 5 }, { 1, 3 }, { 6, 7 } };
        // int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 }
        // };
        int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
        System.out.println(maxPoints(points));
    }
}

/*

// Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.

 

// Example 1:


// Input: points = [[1,1],[2,2],[3,3]]
// Output: 3
// Example 2:


// Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
// Output: 4
 

// Constraints:

// 1 <= points.length <= 300
// points[i].length == 2
// -104 <= xi, yi <= 104
// All the points are unique.

 */