/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-May-21
 *   Time: 12:02 AM
 *   File: Graph.java
 */

package May.may09_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // directed graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public boolean dfsCheckCycle() {
        boolean[] visited = new boolean[adj.size()];
        boolean[] recStack = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                if (dfsRec(adj, i, visited, recStack) == true) {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[] recStack) {
        visited[i] = false;
        recStack[i] = false;
        for (Integer j : adj.get(i)) {
            if (visited[j] == false && dfsRec(adj, j, visited, recStack)) {
                return true;
            } else if (recStack[j] == true) {
                return true;
            }

        }
        recStack[i] = true;
        return false;
    }
}

