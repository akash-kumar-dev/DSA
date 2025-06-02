import java.util.*;

public class Topological_Sorting {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    // Toplogical Sort using DFS
    // public static void topSort(ArrayList<Edge> graph[]) {
    //     boolean vis[] = new boolean[graph.length];
    //     Stack<Integer> s = new Stack<>();

    //     for(int i=0; i<graph.length; i++) {
    //         if(!vis[i]) {
    //             topSortUtil(graph, i, vis, s); // modified DFS
    //         }
    //     }

    //     while(!s.isEmpty()) {
    //         System.out.print(s.pop() + " ");
    //     }
    // }

    // public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
    //     vis[curr] = true;

    //     for(int i=0; i<graph[curr].size(); i++) {
    //         Edge e = graph[curr].get(i);
    //         if(!vis[e.dest]) {
    //             topSortUtil(graph, e.dest, vis, s);
    //         }
    //     }

    //     s.push(curr);
    // }
    
    // Topological Sort using BFS (Kahn's Algorithm)
    public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
        for(int i=0; i<graph.length; i++) {
            int v = i;
            for(int j=0; j<graph[v].size(); j++) {
                Edge e = graph[v].get(j); // e.dest
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        calcIndeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }

        // bfs
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        // topSort(graph);
        topSort(graph);
    }
}