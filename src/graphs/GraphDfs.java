package graphs;

import java.util.ArrayList;

public class GraphDfs {
    // Function to return a list containing the DFS traversal of the graph.
    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();

        boolean[] visited = new boolean[V];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i])
                list = dfs(i, adj, visited, list);
        }

        return list;
    }

    public static ArrayList<Integer> dfs(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited,
            ArrayList<Integer> list) {
        visited[s] = true;
        list.add(s);
        if (adj.get(s).size() > 0) {
            for (int i : adj.get(s)) {
                if (!visited[i]) {
                    dfs(i, adj, visited, list);
                }
            }
        }

        return list;
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);

        ArrayList<Integer> list = dfsOfGraph(V, adj);
        list.forEach(i -> {
            System.out.print(i + " ");
        });

    }

}
