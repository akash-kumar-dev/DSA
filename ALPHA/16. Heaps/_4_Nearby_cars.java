
/**
 * Finds the k nearest points to the origin (0, 0) from a given set of points.
 * The points are represented as (x, y) coordinates, and the distance is calculated as the squared Euclidean distance.
 * The k nearest points are printed to the console, with their index in the original array.
 */

import java.util.*;

public class _4_Nearby_cars {
    static class Point implements Comparable<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSq - p2.distSq; // ascending order
        }
    }

    public static void main(String[] args) {
        int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
        int k = 2;

        PriorityQueue<Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        // nearest k cars
        for (int i = 0; i < k; i++) {
            System.out.println("C" + pq.remove().idx);
        }
    }
}
