import java.util.*;

/**
 * Connects a set of ropes with the minimum cost.
 * The cost of connecting two ropes is the sum of their lengths.
 * The goal is to connect all the ropes with the minimum total cost.
 * This is achieved by repeatedly connecting the two shortest ropes until only
 * one rope remains.
 * 
 * 
 * -----------------------------------------
 * 
 * Given are N ropes of different lengths, the task is to connect these ropes
 * into one rope.with minimum cost,
 * such that the cost to connect two ropes is equal to the sum of their lengths.
 * 
 * ropes = {4,3,2,6}
 * ans = 29
 */

public class _5_connect_N_ropes_with_min_cost {
    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < ropes.length; i++) {
            pq.add(ropes[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min + min2;
            pq.add(min + min2);
        }

        System.out.println("Cost of connecting n ropes = " + cost); // 41
    }
}
