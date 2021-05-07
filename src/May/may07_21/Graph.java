/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-May-21
 *   Time: 7:00 PM
 *   File: Graph.java
 */

package May.may07_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer integer : adj.get(i)) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }

    public boolean DetectCycleInUndirectedGraph() {
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                if (dfsRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                if (dfsRec(adj, u, visited, s)) {
                    return true;
                }
            } else if (u != parent) {
                return true;
            }
        }
        return false;
    }
}

