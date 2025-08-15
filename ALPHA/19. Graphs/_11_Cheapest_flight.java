// Cheapest Flights within K Stops
/**
 * There are n cities connected by some flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight.
 * You are also given three integers src, dest, and k, return the cheapest price from src to dest with at most k stops. If there is no such route, return -1.
 * all values are positive integers.
 */

import java.util.*;

public class _11_Cheapest_flight {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    public static void createGraph(int[][] flights, ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length;  i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, dest, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    @SuppressWarnings("unchecked")
    public static int cheapestFlight(int n, int flights[][], int src, int dest, int k) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        int dist[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stops > k) break;

            for (int i = 0; i < graph[curr.v].size(); i++) {
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if (dist[u] != Integer.MAX_VALUE && dist[v] > curr.cost + wt && curr.stops <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        if (dist[dest] == Integer.MAX_VALUE) {
            return -1;
        }

        return dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0,1,100}, {1,2,200}, {2,0,100}, {1,3,600}, {2,3,2002}};
        int src = 0, dest = 3, k = 1;

        int result = cheapestFlight(n, flights, src, dest, k);
        System.out.println("Cheapest flight cost: " + result);  // Output: 700

    }
}