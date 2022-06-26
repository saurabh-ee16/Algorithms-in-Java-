package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Graph BFS
public class GraphBfs {

    static ArrayList<LinkedList<Integer>> adj;
    static boolean[] visited;

    private static void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    private static void init(int V) {
        adj = new ArrayList<LinkedList<Integer>>(V + 1);
        for (int i = 0; i < V; i++) {
            adj.add(new LinkedList<>());
        }
        visited = new boolean[V];
    }

    private static void bfsUtil(int V) {
        for (int i = 0; i < V; i++) {
            if (!visited[i])
                bfs(i);
        }

    }

    private static void bfs(int s) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            System.err.print(tmp + " ");
            adj.get(tmp).forEach(i -> {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            });

        }

    }

    public static void main(String[] args) {
        int V = 5;
        init(V);
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(2, 3);
        addEdge(3, 4);

        bfsUtil(V);
    }

}
