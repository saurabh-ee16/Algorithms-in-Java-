package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphImpl {

	public static void main(String[] args) {
		int V = 5;
		ArrayList<LinkedList<Integer>> adj = new ArrayList<LinkedList<Integer>>(V);

		for (int i = 0; i < V; i++) {
			adj.add(new LinkedList<Integer>());
		}

		// Adding edges one by one
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);

		printGraph(adj);
	}

	public static void printGraph(ArrayList<LinkedList<Integer>> adj) {
		int V = adj.size();
		for (int i = 0; i < V; i++) {
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(adj.get(i).get(j) + " ");
			}
			System.out.println();
		}

	}

	public static void addEdge(ArrayList<LinkedList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

}
